import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class793 {
   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "I"
   )
   public int field11586 = 0;
   @OriginalMember(
      owner = "client!eca",
      name = "e",
      descriptor = "I"
   )
   public int field11585 = 2048;
   @OriginalMember(
      owner = "client!eca",
      name = "d",
      descriptor = "I"
   )
   public int field11591 = 0;
   @OriginalMember(
      owner = "client!eca",
      name = "i",
      descriptor = "I"
   )
   public int field11590 = 2048;
   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11594 = new String[]{method5718(method5717("U\u001c-\f")), method5718(method5717("@GoNR")), method5718(method5717("^\n Nk\u0013")), method5718(method5717("^\n Nm\u0013")), method5718(method5717("^\n Nn\u0013")), method5718(method5717("^\n Nl\u0013")), method5718(method5717("^\n Nj\u0013"))};
   @OriginalMember(
      owner = "client!eca",
      name = "k",
      descriptor = "Lnw;"
   )
   public static class616 field11589 = new class616(76, -1);
   @OriginalMember(
      owner = "client!eca",
      name = "j",
      descriptor = "F"
   )
   public static float field11588;
   @OriginalMember(
      owner = "client!eca",
      name = "f",
      descriptor = "I"
   )
   public static int field11584;
   @OriginalMember(
      owner = "client!eca",
      name = "c",
      descriptor = "I"
   )
   public static int field11587;
   @OriginalMember(
      owner = "client!eca",
      name = "h",
      descriptor = "I"
   )
   public static int field11592;
   @OriginalMember(
      owner = "client!eca",
      name = "b",
      descriptor = "I"
   )
   public static int field11593;
   @OriginalMember(
      owner = "client!eca",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field11583;

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5712(byte arg0) {
      try {
         field11583 = null;
         if (arg0 > -100) {
            field11588 = -0.67136693F;
         }

         field11589 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11594[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(IZLwm;)V"
   )
   private final void method5713(int arg0, boolean arg1, class594 arg2) {
      boolean var4 = client.field4273;

      try {
         label52: {
            if (arg0 == 1) {
               this.field11591 = arg2.method4288((byte)67);
               if (!var4) {
                  break label52;
               }
            }

            if (~arg0 != -3) {
               if (~arg0 == -4) {
                  this.field11585 = arg2.method4280(-19104);
                  if (!var4) {
                     break label52;
                  }
               }

               if (~arg0 != -5) {
                  break label52;
               }

               this.field11586 = arg2.method4333(-118);
               if (!var4) {
                  break label52;
               }
            }

            this.field11590 = arg2.method4280(-19104);
         }

         if (!arg1) {
            method5716(62);
         }

         ++field11587;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11594[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11594[1] : field11594[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method5714(int arg0, int arg1, byte arg2) {
      try {
         ++field11593;
         return arg2 > -41 ? true : (arg0 & 544) == 544 | (arg0 & 24) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11594[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method5715(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 != 24) {
            field11583 = null;
         }

         while(true) {
            int var4 = arg1.method4288((byte)74);
            if (var4 != 0) {
               this.method5713(var4, true, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field11592;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11594[3] + arg0 + ',' + (arg1 != null ? field11594[1] : field11594[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5716(int arg0) {
      try {
         if (arg0 != 0) {
            field11583 = null;
         }

         class270.field3517.method4245(true);
         ++field11584;
         class663.field9447.method4245(true);
         class276.field3680.method4245(true);
         class56.field603.method4245(true);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11594[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5717(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5718(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
