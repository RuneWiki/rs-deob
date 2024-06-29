import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class279 {
   @OriginalMember(
      owner = "client!cl",
      name = "g",
      descriptor = "Lod;"
   )
   private class536 field3716;
   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3720 = new String[]{method2123(method2122("&\u0014&1R")), method2123(method2122(">V&[\u0007")), method2123(method2122("+\rd\u0019")), method2123(method2122("&\u0014&4R")), method2123(method2122("&\u0014&I\u0013+\u0011|KR")), method2123(method2122("&\u0014&0R")), method2123(method2122("&\u0014&6R")), method2123(method2122("&\u0014&7R"))};
   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "I"
   )
   public static int field3713;
   @OriginalMember(
      owner = "client!cl",
      name = "d",
      descriptor = "I"
   )
   public static int field3715;
   @OriginalMember(
      owner = "client!cl",
      name = "e",
      descriptor = "I"
   )
   public static int field3717;
   @OriginalMember(
      owner = "client!cl",
      name = "c",
      descriptor = "I"
   )
   public static int field3718;
   @OriginalMember(
      owner = "client!cl",
      name = "b",
      descriptor = "I"
   )
   public static int field3719;
   @OriginalMember(
      owner = "client!cl",
      name = "f",
      descriptor = "Lmaa;"
   )
   private class500 field3714;

   @OriginalMember(
      owner = "client!cl",
      name = "b",
      descriptor = "(B)Lmaa;"
   )
   public final class500 method2117(byte arg0) {
      try {
         ++field3715;
         class500 var2 = this.field3716.field7319.field6867;
         if (this.field3716.field7319 == var2) {
            this.field3714 = null;
            return null;
         } else {
            if (arg0 != -2) {
               this.field3716 = null;
            }

            this.field3714 = var2.field6867;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3720[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(ILod;)V"
   )
   public final void method2118(int arg0, class536 arg1) {
      try {
         this.field3716 = arg1;
         ++field3713;
         if (arg0 > -61) {
            this.method2120((byte)72);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3720[0] + arg0 + ',' + (arg1 != null ? field3720[1] : field3720[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2119(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field3719;
         int var2 = 0;
         if (arg0 == 3432) {
            int var3 = 0;
            if (var1 || ~class507.field7030 < ~var3) {
               do {
                  int var4 = 0;
                  if (var1) {
                     if (class420.method3177(var3, var4, -18734, var2, true, class111.field1404)) {
                        ++var2;
                     }

                     if (var2 >= 512) {
                        return;
                     }

                     ++var4;
                  }

                  while(true) {
                     while(var4 < class215.field2667) {
                        if (class420.method3177(var3, var4, -18734, var2, true, class111.field1404)) {
                           ++var2;
                        }

                        if (var2 >= 512) {
                           return;
                        }

                        ++var4;
                     }

                     if (!var1) {
                        ++var3;
                        break;
                     }

                     if (var2 >= 512) {
                        return;
                     }

                     ++var4;
                  }
               } while(~class507.field7030 < ~var3);

            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3720[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(B)Lmaa;"
   )
   public final class500 method2120(byte arg0) {
      try {
         ++field3717;
         if (arg0 != 119) {
            this.field3714 = null;
         }

         class500 var2 = this.field3714;
         if (this.field3716.field7319 == var2) {
            this.field3714 = null;
            return null;
         } else {
            this.field3714 = var2.field6867;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3720[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2121(int arg0, int arg1, int arg2) {
      try {
         ++field3718;
         if (arg0 != 512) {
            method2119(-7);
         }

         return class28.method234(arg1, arg2, 2) & class182.method1396(-1, arg1, arg2);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3720[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "<init>",
      descriptor = "()V"
   )
   public class279() {
   }

   @OriginalMember(
      owner = "client!cl",
      name = "<init>",
      descriptor = "(Lod;)V"
   )
   public class279(class536 arg0) {
      try {
         this.field3716 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3720[4] + (arg0 != null ? field3720[1] : field3720[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2122(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2123(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
