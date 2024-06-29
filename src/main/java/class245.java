import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class245 {
   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3095 = new String[]{method1947(method1946("-\u0018bP8")), method1947(method1946("-\u0018bS8")), method1947(method1946("-\u0018bR8"))};
   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "I"
   )
   public static int field3093;
   @OriginalMember(
      owner = "client!ch",
      name = "c",
      descriptor = "I"
   )
   public static int field3094;
   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "[[[B"
   )
   public static byte[][][] field3092;

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1943(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field3093;
         int var2 = 0;
         if (arg0 <= 43) {
            method1944(-91);
         }

         int var3 = 0;
         if (var1 || var3 < class273.field3491) {
            do {
               int var4 = 0;
               if (var1) {
                  if (class278.method2196(true, var2, var3, var4, class548.field8080, (byte)126)) {
                     ++var2;
                  }

                  if (~var2 <= -513) {
                     return;
                  }

                  ++var4;
               }

               while(true) {
                  while(~class211.field2689 < ~var4) {
                     if (class278.method2196(true, var2, var3, var4, class548.field8080, (byte)126)) {
                        ++var2;
                     }

                     if (~var2 <= -513) {
                        return;
                     }

                     ++var4;
                  }

                  if (!var1) {
                     ++var3;
                     break;
                  }

                  if (~var2 <= -513) {
                     return;
                  }

                  ++var4;
               }
            } while(var3 < class273.field3491);

         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3095[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1944(int arg0) {
      try {
         field3092 = null;
         if (arg0 != -1332) {
            method1943((byte)-25);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3095[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method1945(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field3094;
         boolean var2 = true;
         if (class686.field10106 == null) {
            label69: {
               if (!class268.field3430.method2681((byte)86, class120.field1580)) {
                  var2 = false;
                  if (!var1) {
                     break label69;
                  }
               }

               class686.field10106 = class65.method577(class268.field3430, class120.field1580);
            }
         }

         if (class549.field8091 == null) {
            label63: {
               if (class268.field3430.method2681((byte)61, class123.field1613)) {
                  class549.field8091 = class65.method577(class268.field3430, class123.field1613);
                  if (!var1) {
                     break label63;
                  }
               }

               var2 = false;
            }
         }

         if (class214.field2720 == null) {
            label57: {
               if (class268.field3430.method2681((byte)68, class267.field3377)) {
                  class214.field2720 = class65.method577(class268.field3430, class267.field3377);
                  if (!var1) {
                     break label57;
                  }
               }

               var2 = false;
            }
         }

         if (class593.field8748 == null) {
            label51: {
               if (class94.field1276.method2681((byte)84, class7.field92)) {
                  class593.field8748 = class481.method3655(class94.field1276, 52, class7.field92);
                  if (!var1) {
                     break label51;
                  }
               }

               var2 = false;
            }
         }

         if (arg0 != 0) {
            method1944(15);
         }

         if (class229.field2867 == null) {
            if (class268.field3430.method2681((byte)94, class7.field92)) {
               class229.field2867 = class65.method585(class268.field3430, class7.field92);
               if (!var1) {
                  return var2;
               }
            }

            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3095[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1946(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1947(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
