import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class275 extends class647 {
   @OriginalMember(
      owner = "client!bha",
      name = "D",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3509;
   @OriginalMember(
      owner = "client!bha",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3515 = new String[]{method2174(method2173("w\u0013~q!=")), method2174(method2173("w\u0013~q\"=")), method2174(method2173("w\u0013~q'=")), method2174(method2173("w\u0013~q&=")), method2174(method2173("w\u0013~q =")), method2174(method2173("w\u0013~q_|\u0015v+]=")), method2174(method2173("nU1q\u001e")), method2174(method2173("{\u000es3"))};
   @OriginalMember(
      owner = "client!bha",
      name = "B",
      descriptor = "I"
   )
   public static int field3510;
   @OriginalMember(
      owner = "client!bha",
      name = "A",
      descriptor = "I"
   )
   public static int field3511;
   @OriginalMember(
      owner = "client!bha",
      name = "F",
      descriptor = "I"
   )
   public static int field3512;
   @OriginalMember(
      owner = "client!bha",
      name = "G",
      descriptor = "I"
   )
   public static int field3513;
   @OriginalMember(
      owner = "client!bha",
      name = "C",
      descriptor = "[Leia;"
   )
   public static class788[] field3514;

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public static final int method2170(int arg0, int arg1, boolean arg2) {
      boolean var3 = client.field1481;

      try {
         ++field3512;
         if (arg2) {
            return 0;
         } else {
            if (arg1 <= 67) {
               method2172((byte)-124, 22);
            }

            class657 var4 = class733.method5295(arg0, arg2, (byte)-67);
            if (var4 == null) {
               return class532.field7813.method153((byte)-7, arg0).field1757;
            } else {
               int var5 = 0;
               int var6 = 0;
               if (var3) {
                  if (~var4.field9798[var6] == 0) {
                     ++var5;
                  }

                  ++var6;
               }

               while(true) {
                  while(var4.field9798.length > var6) {
                     if (~var4.field9798[var6] == 0) {
                        ++var5;
                     }

                     ++var6;
                  }

                  var5 += class532.field7813.method153((byte)-7, arg0).field1757 + -var4.field9798.length;
                  if (!var3) {
                     return var5;
                  }

                  if (var5 == 0) {
                     ++var5;
                  }

                  ++var6;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3515[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method546(byte arg0) {
      try {
         ++field3510;
         return arg0 != -72 ? null : this.field3509;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3515[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method2171(int arg0) {
      try {
         if (arg0 != 0) {
            field3514 = null;
         }

         field3514 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3515[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method545(byte arg0) {
      try {
         if (arg0 != 28) {
            return false;
         } else {
            ++field3511;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3515[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "<init>",
      descriptor = "(Lwja;Ljava/lang/Object;I)V"
   )
   public class275(class352 arg0, Object arg1, int arg2) {
      super(arg0, arg2);

      try {
         this.field3509 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3515[5] + (arg0 != null ? field3515[6] : field3515[7]) + ',' + (arg1 != null ? field3515[6] : field3515[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method2172(byte arg0, int arg1) {
      try {
         if (arg0 <= 87) {
            method2172((byte)-120, 96);
         }

         ++field3513;
         return ~arg1 == -1 || ~arg1 == -2 || arg1 == 2;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3515[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2173(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2174(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
