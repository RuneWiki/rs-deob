import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class645 {
   @OriginalMember(
      owner = "client!jaa",
      name = "j",
      descriptor = "I"
   )
   public int field9045 = -1;
   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "I"
   )
   private int field9051 = 0;
   @OriginalMember(
      owner = "client!jaa",
      name = "c",
      descriptor = "Z"
   )
   public boolean field9052 = true;
   @OriginalMember(
      owner = "client!jaa",
      name = "f",
      descriptor = "Z"
   )
   public boolean field9053 = true;
   @OriginalMember(
      owner = "client!jaa",
      name = "k",
      descriptor = "I"
   )
   public int field9056 = 512;
   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9057 = new String[]{method4653(method4652("\u0002\u001cH%\u0006@")), method4653(method4652("S]_n7\u001b\u0014FexYF\t{$\u001c\u0015\u0014$~H\u0019Ff$\u0001\u0013\u0014")), method4653(method4652("\u001d\u000e[o*\n@")), method4653(method4652("\u0002\u001cH%\u0000@")), method4653(method4652("\u000b\u0012F`,\r\u0015Fx1")), method4653(method4652("\f\u0012J~(\r\u0013]%&\u0007\u0012Bb U_")), method4653(method4652("\u0013S\u0007%8")), method4653(method4652("\u0002\u001cH%\u0001@")), method4653(method4652("\u0006\bEg")), method4653(method4652("\u0002\u001cH%\u0007@")), method4653(method4652("\u0002\u001cH%\u0004@"))};
   @OriginalMember(
      owner = "client!jaa",
      name = "e",
      descriptor = "I"
   )
   public int field9043;
   @OriginalMember(
      owner = "client!jaa",
      name = "d",
      descriptor = "I"
   )
   public static int field9044;
   @OriginalMember(
      owner = "client!jaa",
      name = "m",
      descriptor = "I"
   )
   public static int field9046;
   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "I"
   )
   public int field9047;
   @OriginalMember(
      owner = "client!jaa",
      name = "g",
      descriptor = "I"
   )
   public int field9048;
   @OriginalMember(
      owner = "client!jaa",
      name = "n",
      descriptor = "I"
   )
   public static int field9049;
   @OriginalMember(
      owner = "client!jaa",
      name = "h",
      descriptor = "I"
   )
   public int field9050;
   @OriginalMember(
      owner = "client!jaa",
      name = "i",
      descriptor = "I"
   )
   public static int field9055;
   @OriginalMember(
      owner = "client!jaa",
      name = "l",
      descriptor = "Lnr;"
   )
   public static class64 field9054;

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4647(int arg0) {
      try {
         if (arg0 != 1652604848) {
            method4647(21);
         }

         field9054 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9057[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method4648(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label62: {
            if (arg2 == 1) {
               this.field9051 = arg0.method4293(95);
               this.method4650(0, this.field9051);
               if (!var4) {
                  break label62;
               }
            }

            if (arg2 != 2) {
               if (~arg2 == -4) {
                  this.field9056 = arg0.method4280(-19104) << 2;
                  if (!var4) {
                     break label62;
                  }
               }

               if (arg2 == 4) {
                  this.field9053 = false;
                  if (!var4) {
                     break label62;
                  }
               }

               if (~arg2 != -6) {
                  break label62;
               }

               this.field9052 = false;
               if (!var4) {
                  break label62;
               }
            }

            this.field9045 = arg0.method4280(-19104);
            if (this.field9045 == 65535) {
               this.field9045 = -1;
            }
         }

         if (arg1 != -25841) {
            this.field9056 = -25;
         }

         ++field9055;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9057[7] + (arg0 != null ? field9057[6] : field9057[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method4649(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         while(true) {
            int var4 = arg1.method4288((byte)65);
            if (var4 != 0) {
               this.method4648(arg1, -25841, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 > -69) {
               this.method4648((class594)null, -82, -57);
            }

            ++field9046;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9057[10] + arg0 + ',' + (arg1 != null ? field9057[6] : field9057[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method4650(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9044;
         double var4 = (double)(255 & arg1 >> 16) / 256.0D;
         double var6 = (double)(arg1 >> 8 & 255) / 256.0D;
         double var8 = (double)(255 & arg1) / 256.0D;
         double var10 = var4;
         if (var4 > var6) {
            var10 = var6;
         }

         if (var8 < var10) {
            var10 = var8;
         }

         double var12 = var4;
         if (var4 < var6) {
            var12 = var6;
         }

         if (var12 < var8) {
            var12 = var8;
         }

         double var14 = (double)arg0;
         double var16 = 0.0D;
         double var18 = (var10 + var12) / 2.0D;
         if (var10 != var12) {
            label96: {
               if (var18 < 0.5D) {
                  var16 = (var12 - var10) / (var10 + var12);
               }

               if (var18 >= 0.5D) {
                  var16 = (-var10 + var12) / (2.0D - var12 + -var10);
               }

               if (var4 == var12) {
                  var14 = (var6 - var8) / (-var10 + var12);
                  if (!var3) {
                     break label96;
                  }
               }

               if (var6 != var12) {
                  if (var8 != var12) {
                     break label96;
                  }

                  var14 = (var4 - var6) / (-var10 + var12) + 4.0D;
                  if (!var3) {
                     break label96;
                  }
               }

               var14 = (-var4 + var8) / (-var10 + var12) + 2.0D;
            }
         }

         double var20;
         label70: {
            this.field9043 = (int)(var16 * 256.0D);
            this.field9050 = (int)(var18 * 256.0D);
            var20 = var14 / 6.0D;
            if (var18 > 0.5D) {
               this.field9047 = (int)((1.0D - var18) * var16 * 512.0D);
               if (!var3) {
                  break label70;
               }
            }

            this.field9047 = (int)(var16 * var18 * 512.0D);
         }

         label65: {
            if (~this.field9050 > -1) {
               this.field9050 = 0;
               if (!var3) {
                  break label65;
               }
            }

            if (~this.field9050 < -256) {
               this.field9050 = 255;
            }
         }

         label60: {
            if (~this.field9043 > -1) {
               this.field9043 = 0;
               if (!var3) {
                  break label60;
               }
            }

            if (~this.field9043 < -256) {
               this.field9043 = 255;
            }
         }

         if (~this.field9047 > -2) {
            this.field9047 = 1;
         }

         this.field9048 = (int)((double)this.field9047 * var20);
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field9057[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4651(int arg0) {
      try {
         ++field9049;
         if (class126.field1586 != null) {
            try {
               String var1 = class126.field1586.getParameter(field9057[4]);
               int var2 = (int)(class792.method5708(-25005) / 86400000L) + arg0;
               String var3 = field9057[2] + var2 + field9057[1] + var1;
               class164.method1308(field9057[5] + var3 + "\"", -31829, class126.field1586);
            } catch (Throwable var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9057[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4652(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4653(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
