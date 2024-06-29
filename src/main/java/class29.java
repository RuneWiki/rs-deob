import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class29 extends class606 {
   @OriginalMember(
      owner = "client!qg",
      name = "Q",
      descriptor = "I"
   )
   private int field420 = 1;
   @OriginalMember(
      owner = "client!qg",
      name = "I",
      descriptor = "I"
   )
   private int field423 = 0;
   @OriginalMember(
      owner = "client!qg",
      name = "G",
      descriptor = "I"
   )
   private int field426 = 0;
   @OriginalMember(
      owner = "client!qg",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field433 = new String[]{method365(method364("\u0002\rk^\u001f")), method365(method364("\u0002\rk]\u001f")), method365(method364("\u0002\rkQ\u001f")), method365(method364("\u0002\rkW\u001f")), method365(method364("\bDk8J")), method365(method364("\u001d\u001f)z")), method365(method364("\u0002\rk\\\u001f")), method365(method364("\u0002\rk_\u001f"))};
   @OriginalMember(
      owner = "client!qg",
      name = "H",
      descriptor = "Z"
   )
   public static boolean field424 = false;
   @OriginalMember(
      owner = "client!qg",
      name = "E",
      descriptor = "I"
   )
   public static int field429 = -1;
   @OriginalMember(
      owner = "client!qg",
      name = "F",
      descriptor = "I"
   )
   public static int field430 = 100;
   @OriginalMember(
      owner = "client!qg",
      name = "D",
      descriptor = "I"
   )
   public static int field421;
   @OriginalMember(
      owner = "client!qg",
      name = "L",
      descriptor = "I"
   )
   public static int field422;
   @OriginalMember(
      owner = "client!qg",
      name = "O",
      descriptor = "I"
   )
   public static int field425;
   @OriginalMember(
      owner = "client!qg",
      name = "J",
      descriptor = "I"
   )
   public static int field427;
   @OriginalMember(
      owner = "client!qg",
      name = "P",
      descriptor = "I"
   )
   public static int field428;
   @OriginalMember(
      owner = "client!qg",
      name = "N",
      descriptor = "I"
   )
   public static int field431;
   @OriginalMember(
      owner = "client!qg",
      name = "R",
      descriptor = "I"
   )
   public static int field432;

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method361(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(ILjava/lang/String;)[B"
   )
   public static final byte[] method362(int arg0, String arg1) {
      try {
         ++field427;
         int var2 = arg1.length();
         if (var2 == 0) {
            return new byte[0];
         } else if (arg0 > -62) {
            return null;
         } else {
            int var4;
            label37: {
               int var3 = var2 + 3 & -4;
               var4 = var3 / 4 * 3;
               if (var3 + -2 < var2 && class664.method4827(arg1.charAt(var3 + -2), -1) != -1) {
                  if (var3 + -1 < var2 && ~class664.method4827(arg1.charAt(var3 + -1), -1) != 0) {
                     break label37;
                  }

                  --var4;
                  if (!client.field10022) {
                     break label37;
                  }
               }

               var4 -= 2;
            }

            byte[] var5 = new byte[var4];
            class368.method2899((byte)94, var5, arg1, 0);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field433[7] + arg0 + ',' + (arg1 != null ? field433[4] : field433[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         class22.method299(4096);
         if (arg0 > 118) {
            ++field425;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field433[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "<init>",
      descriptor = "()V"
   )
   public class29() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label46: {
            label45: {
               label44: {
                  if (~arg1 != -1) {
                     if (~arg1 == -2) {
                        break label44;
                     }

                     if (~arg1 != -4) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field426 = arg0.method665(false);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field423 = arg0.method665(false);
               if (!var4) {
                  break label46;
               }
            }

            this.field420 = arg0.method665(false);
         }

         if (arg2 > -6) {
            field429 = 91;
         }

         ++field422;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field433[3] + (arg0 != null ? field433[4] : field433[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(JI)Ljava/lang/String;"
   )
   public static final String method363(long arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field431;
         if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (~(arg0 % (long)arg1) == -1L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg0;
               if (var3) {
                  ++var4;
                  var5 = arg0 / 37L;
               }

               while(true) {
                  if (~var5 == -1L) {
                     StringBuffer var7 = new StringBuffer(var4);
                     if (!var3) {
                        if (!var3 && ~arg0 == -1L) {
                           return var7.reverse().toString();
                        } else {
                           do {
                              long var8 = arg0;
                              arg0 /= 37L;
                              var7.append(class465.field6757[(int)(-(arg0 * 37L) + var8)]);
                           } while(~arg0 != -1L);

                           return var7.reverse().toString();
                        }
                     }
                  } else {
                     ++var4;
                  }

                  var5 /= 37L;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field433[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field432;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int var5 = class693.field10001[arg1];
            int var6 = var5 + -2048 >> 1;
            int var7 = 0;
            if (var3 || ~var7 > ~class563.field8014) {
               do {
                  int var10;
                  label44: {
                     int var8 = class387.field5650[var7];
                     int var9 = var8 + -2048 >> 1;
                     if (this.field426 == 0) {
                        var10 = (var8 - var5) * this.field420;
                        if (!var3) {
                           break label44;
                        }
                     }

                     int var11 = var6 * var6 + var9 * var9 >> 12;
                     int var12 = (int)(Math.sqrt((double)((float)var11 / 4096.0F)) * 4096.0D);
                     var10 = (int)((double)(this.field420 * var12) * 3.141592653589793D);
                  }

                  int var13 = var10 - (var10 & -4096);
                  if (~this.field423 == -1) {
                     var13 = class608.field8660[(4086 & var13) >> 4] + 4096 >> 1;
                     if (!var3) {
                        var4[var7] = var13;
                        ++var7;
                        continue;
                     }
                  }

                  if (~this.field423 == -3) {
                     var13 -= 2048;
                     if (var13 < 0) {
                        var13 = -var13;
                     }

                     var13 = 2048 - var13 << 1;
                  }

                  var4[var7] = var13;
                  ++var7;
               } while(~var7 > ~class563.field8014);
            }
         }

         if (arg0 != 0) {
            field430 = 43;
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field433[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method364(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method365(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
