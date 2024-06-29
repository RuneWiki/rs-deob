import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class533 {
   @OriginalMember(
      owner = "client!ko",
      name = "b",
      descriptor = "Lea;"
   )
   private class573 field7601;
   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "I"
   )
   public int field7600;
   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7603 = new String[]{method3840(method3839("y\u0018<\u001eH")), method3840(method3839("y\u0018<;\t|\u0016~4\u001aw_")), method3840(method3839("|\u0002~1")), method3840(method3839("iY<s\u001d")), method3840(method3839("y\u0018<a\t|\u001efcH")), method3840(method3839("y\u0018<\u001fH")), method3840(method3839("y\u0018<\u001cH"))};
   @OriginalMember(
      owner = "client!ko",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field7598 = new int[4096];
   @OriginalMember(
      owner = "client!ko",
      name = "c",
      descriptor = "I"
   )
   public static int field7596 = -1;
   @OriginalMember(
      owner = "client!ko",
      name = "d",
      descriptor = "I"
   )
   public static int field7595;
   @OriginalMember(
      owner = "client!ko",
      name = "f",
      descriptor = "I"
   )
   public static int field7597;
   @OriginalMember(
      owner = "client!ko",
      name = "e",
      descriptor = "I"
   )
   public static int field7599;
   @OriginalMember(
      owner = "client!ko",
      name = "h",
      descriptor = "I"
   )
   public static int field7602;

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(Z)Z",
      line = 7
   )
   public static final boolean method3836(boolean arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0) {
            method3838(72, 23);
         }

         ++field7597;
         class502 var2 = (class502)class641.field9368.method2933(2);
         if (var2 == null) {
            return false;
         } else {
            int var3 = 0;
            if (var1) {
               if (var2.field7283[var3] != null && ~var2.field7283[var3].field4078 == -1) {
                  return false;
               }

               if (var2.field7291[var3] != null) {
                  if (var2.field7291[var3].field4078 == 0) {
                     return false;
                  }

                  ++var3;
               } else {
                  ++var3;
               }
            }

            while(true) {
               while(var3 < var2.field7288) {
                  if (var2.field7283[var3] != null && ~var2.field7283[var3].field4078 == -1) {
                     return false;
                  }

                  if (var2.field7291[var3] != null) {
                     if (var2.field7291[var3].field4078 == 0) {
                        return false;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               }

               if (!var1) {
                  return true;
               }

               if (false) {
                  return false;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7603[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "finalize",
      descriptor = "()V",
      line = 49
   )
   protected final void finalize() throws Throwable {
      try {
         this.field7601.method4162((byte)97, this.field7600);
         ++field7602;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7603[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(I)V",
      line = 64
   )
   public static void method3837(int arg0) {
      try {
         field7598 = null;
         if (arg0 != 0) {
            field7596 = 109;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7603[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(II)V",
      line = 76
   )
   public static final void method3838(int arg0, int arg1) {
      try {
         if (arg1 == -31359) {
            class136.field1737 = class430.field6150;
            ++field7599;
            class235.field3273 = 2;
            class686.field10122 = arg0;
            class506.method3675(class43.field597.equals(""), true, "", class43.field597, 0);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7603[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "<init>",
      descriptor = "(Lea;II)V",
      line = 89
   )
   public class533(class573 arg0, int arg1, int arg2) {
      try {
         this.field7601 = arg0;
         this.field7600 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7603[4] + (arg0 != null ? field7603[3] : field7603[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3839(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3840(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
