import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class501 extends class565 implements class338 {
   @OriginalMember(
      owner = "client!mt",
      name = "K",
      descriptor = "Z"
   )
   private boolean field7143 = true;
   @OriginalMember(
      owner = "client!mt",
      name = "P",
      descriptor = "Lpn;"
   )
   public class735 field7153;
   @OriginalMember(
      owner = "client!mt",
      name = "U",
      descriptor = "Z"
   )
   private boolean field7155;
   @OriginalMember(
      owner = "client!mt",
      name = "nb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7165 = new String[]{method3794(method3793("*b\f\u0012'")), method3794(method3793("*b\f\u000e'")), method3794(method3793("*b\f\u0007No")), method3794(method3793(")cN*")), method3794(method3793("<8\fhr")), method3794(method3793("*b\f\u0014'")), method3794(method3793("*b\f\u0002No")), method3794(method3793("*b\f\u0004No")), method3794(method3793("*b\f\u000f'")), method3794(method3793("*b\f\u0007'")), method3794(method3793("*b\f\r'")), method3794(method3793("*b\f\n'")), method3794(method3793("*b\f\u0000No")), method3794(method3793("*b\f\u0005'")), method3794(method3793("*b\fzf)\u007fVx'")), method3794(method3793("*b\f\u0011'")), method3794(method3793("*b\f\b'")), method3794(method3793("*b\f\u0000'")), method3794(method3793("*b\f\u0001'")), method3794(method3793("*b\f\f'")), method3794(method3793("*b\f\u0015'")), method3794(method3793("*b\f\u0016'")), method3794(method3793("*b\f\u000b'")), method3794(method3793("*b\f\u0017'")), method3794(method3793("*b\f\t'"))};
   @OriginalMember(
      owner = "client!mt",
      name = "W",
      descriptor = "[Lkaa;"
   )
   public static class158[] field7137 = new class158[2048];
   @OriginalMember(
      owner = "client!mt",
      name = "Z",
      descriptor = "I"
   )
   public static int field7146 = -1;
   @OriginalMember(
      owner = "client!mt",
      name = "ib",
      descriptor = "I"
   )
   public static int field7151 = 0;
   @OriginalMember(
      owner = "client!mt",
      name = "X",
      descriptor = "[I"
   )
   public static int[] field7148 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @OriginalMember(
      owner = "client!mt",
      name = "mb",
      descriptor = "I"
   )
   public static int field7136;
   @OriginalMember(
      owner = "client!mt",
      name = "lb",
      descriptor = "I"
   )
   public static int field7138;
   @OriginalMember(
      owner = "client!mt",
      name = "kb",
      descriptor = "I"
   )
   public static int field7139;
   @OriginalMember(
      owner = "client!mt",
      name = "eb",
      descriptor = "I"
   )
   public static int field7140;
   @OriginalMember(
      owner = "client!mt",
      name = "gb",
      descriptor = "I"
   )
   public static int field7141;
   @OriginalMember(
      owner = "client!mt",
      name = "S",
      descriptor = "I"
   )
   public static int field7142;
   @OriginalMember(
      owner = "client!mt",
      name = "V",
      descriptor = "I"
   )
   public static int field7144;
   @OriginalMember(
      owner = "client!mt",
      name = "M",
      descriptor = "I"
   )
   public static int field7145;
   @OriginalMember(
      owner = "client!mt",
      name = "db",
      descriptor = "I"
   )
   public static int field7147;
   @OriginalMember(
      owner = "client!mt",
      name = "Y",
      descriptor = "I"
   )
   public static int field7149;
   @OriginalMember(
      owner = "client!mt",
      name = "hb",
      descriptor = "I"
   )
   public static int field7150;
   @OriginalMember(
      owner = "client!mt",
      name = "fb",
      descriptor = "I"
   )
   public static int field7152;
   @OriginalMember(
      owner = "client!mt",
      name = "N",
      descriptor = "I"
   )
   public static int field7154;
   @OriginalMember(
      owner = "client!mt",
      name = "O",
      descriptor = "I"
   )
   public static int field7156;
   @OriginalMember(
      owner = "client!mt",
      name = "Q",
      descriptor = "I"
   )
   public static int field7157;
   @OriginalMember(
      owner = "client!mt",
      name = "bb",
      descriptor = "I"
   )
   public static int field7158;
   @OriginalMember(
      owner = "client!mt",
      name = "T",
      descriptor = "I"
   )
   public static int field7159;
   @OriginalMember(
      owner = "client!mt",
      name = "cb",
      descriptor = "I"
   )
   public static int field7160;
   @OriginalMember(
      owner = "client!mt",
      name = "jb",
      descriptor = "I"
   )
   public static int field7161;
   @OriginalMember(
      owner = "client!mt",
      name = "R",
      descriptor = "I"
   )
   public static int field7162;
   @OriginalMember(
      owner = "client!mt",
      name = "ab",
      descriptor = "I"
   )
   public static int field7164;
   @OriginalMember(
      owner = "client!mt",
      name = "L",
      descriptor = "Loga;"
   )
   private class358 field7163;

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public final void method727(class17 arg0, int arg1) {
      try {
         ++field7156;
         if (arg1 != -26496) {
            field7148 = null;
         }

         this.field7153.method5324(true, arg0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7165[20] + (arg0 != null ? field7165[4] : field7165[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(BLcn;)V"
   )
   public final void method3789(byte arg0, class468 arg1) {
      try {
         ++field7141;
         this.field7153.method5322(arg1, 5343);
         if (arg0 != 13) {
            this.method723(87);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7165[23] + arg0 + ',' + (arg1 != null ? field7165[4] : field7165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public final boolean method718(int arg0, int arg1, int arg2, class17 arg3) {
      try {
         ++field7164;
         class761 var5 = this.field7153.method5325(false, arg3, false, 131072, 10);
         if (var5 == null) {
            return false;
         } else {
            class502 var6 = arg3.method254();
            if (arg2 != 0) {
               this.field7143 = true;
            }

            var6.method322(super.field6832, super.field6829, super.field6833);
            return class791.field11526 ? var5.method804(arg0, arg1, var6, false, 0, class582.field8178) : var5.method748(arg0, arg1, var6, false, 0);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7165[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7165[4] : field7165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method732(int arg0) {
      try {
         if (arg0 == 9799) {
            ++field7162;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(ILdea;IZLha;II)V"
   )
   public final void method719(int arg0, class471 arg1, int arg2, boolean arg3, class17 arg4, int arg5, int arg6) {
      try {
         if (arg6 != 0) {
            field7146 = -24;
         }

         ++field7154;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field7165[17] + arg0 + ',' + (arg1 != null ? field7165[4] : field7165[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7165[4] : field7165[3]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method720(byte arg0) {
      try {
         ++field7161;
         if (arg0 >= -75) {
            this.field7163 = null;
         }

         return this.field7153.method5313((byte)-111);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "<init>",
      descriptor = "(Lha;Lbha;IIIIIZIII)V"
   )
   public class501(class17 arg0, class544 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
      super(arg4, arg5, arg6, arg2, arg3, class654.method4780(false, arg9, arg8));

      try {
         this.field7153 = new class735(arg0, arg1, arg8, arg9, super.field6824, arg3, this, arg7, arg10);
         this.field7155 = ~arg1.field7716 != -1 && !arg7;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7165[14] + (arg0 != null ? field7165[4] : field7165[3]) + ',' + (arg1 != null ? field7165[4] : field7165[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method731(int arg0) {
      try {
         ++field7158;
         if (arg0 != 255) {
            this.field7155 = false;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "k",
      descriptor = "(I)Z"
   )
   public final boolean method723(int arg0) {
      try {
         ++field7140;
         if (arg0 > -26) {
            this.field7143 = true;
         }

         return this.field7143;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method733(int arg0) {
      try {
         if (arg0 != 28344) {
            return -85;
         } else {
            ++field7142;
            return this.field7153.field10458;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(IZ)Lhn;"
   )
   public static final class357 method3790(int arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         ++field7147;
         class357[] var3 = class197.method1733((byte)-100);
         if (arg1) {
            field7137 = null;
         }

         int var4 = 0;
         if (!var2 && ~var4 <= ~var3.length) {
            return null;
         } else {
            do {
               class357 var5 = var3[var4];
               if (var5.field5280 == arg0) {
                  return var5;
               }

               ++var4;
            } while(~var4 > ~var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7165[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public final void method726(class17 arg0, byte arg1) {
      try {
         int var3 = -50 / ((39 - arg1) / 46);
         ++field7144;
         class761 var4 = this.field7153.method5325(true, arg0, true, 262144, 10);
         if (var4 != null) {
            int var5 = super.field6832 >> 9;
            int var6 = super.field6833 >> 9;
            class502 var7 = arg0.method254();
            var7.method322(super.field6832, super.field6829, super.field6833);
            this.field7153.method5323(var6, var5, var4, var7, false, -1, arg0, var5, var6);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field7165[11] + (arg0 != null ? field7165[4] : field7165[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(ZLha;)Loga;"
   )
   public final class358 method722(boolean arg0, class17 arg1) {
      try {
         if (arg0) {
            this.field7155 = true;
         }

         ++field7145;
         return this.field7163;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7165[6] + arg0 + ',' + (arg1 != null ? field7165[4] : field7165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method735(int arg0) {
      try {
         ++field7159;
         int var2 = 57 % ((arg0 - -5) / 62);
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7165[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "l",
      descriptor = "(I)I"
   )
   public static final int method3791(int arg0) {
      try {
         int var1 = -19 % ((arg0 - 48) / 57);
         ++field7150;
         int var2 = class428.field6277.method3720((byte)116);
         if (~(class653.field9254.length + -1) < ~var2) {
            class428.field6277 = class653.field9254[var2 + 1];
         }

         return 100;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7165[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method3792(byte arg0) {
      try {
         field7148 = null;
         if (arg0 >= 79) {
            field7137 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7165[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method734(int arg0) {
      try {
         if (arg0 != -5723) {
            this.method732(87);
         }

         ++field7138;
         return this.field7153.field10460;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method721(byte arg0) {
      try {
         if (arg0 <= 81) {
            this.field7153 = null;
         }

         ++field7157;
         return this.field7153.method5316(true);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "b",
      descriptor = "(ILha;)Lwba;"
   )
   public final class731 method730(int arg0, class17 arg1) {
      boolean var3 = client.field10022;

      try {
         ++field7136;
         class761 var4 = this.field7153.method5325(false, arg1, true, 2048, 10);
         if (var4 == null) {
            return null;
         } else {
            class502 var5 = arg1.method254();
            var5.method322(super.field6832, super.field6829, super.field6833);
            class731 var6 = class54.method574(0, this.field7155, 1);
            int var7 = super.field6832 >> 9;
            if (arg0 >= -30) {
               this.field7153 = null;
            }

            label58: {
               int var8 = super.field6833 >> 9;
               this.field7153.method5323(var8, var7, var4, var5, true, -1, arg1, var7, var8);
               if (class791.field11526) {
                  var4.method763(var5, var6.field10397[0], class582.field8178, 0);
                  if (!var3) {
                     break label58;
                  }
               }

               var4.method805(var5, var6.field10397[0], 0);
            }

            if (this.field7153.field10485 != null) {
               label52: {
                  class521 var9 = this.field7153.field10485.method3980();
                  if (!class791.field11526) {
                     arg1.method194(var9);
                     if (!var3) {
                        break label52;
                     }
                  }

                  arg1.method169(var9, class582.field8178);
               }
            }

            this.field7143 = var4.method781() || this.field7153.field10485 != null;
            if (this.field7163 == null) {
               this.field7163 = class357.method2806(super.field6833, super.field6832, -126, var4, super.field6829);
               if (!var3) {
                  return var6;
               }
            }

            class228.method2026(this.field7163, var4, super.field6829, 120, super.field6832, super.field6833);
            return var6;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7165[5] + arg0 + ',' + (arg1 != null ? field7165[4] : field7165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method728(int arg0) {
      try {
         if (arg0 != 0) {
            this.field7153 = null;
         }

         ++field7152;
         return this.field7153.method5320((byte)98);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "h",
      descriptor = "(I)Z"
   )
   public final boolean method725(int arg0) {
      try {
         if (arg0 != -6664) {
            field7148 = null;
         }

         ++field7160;
         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public final void method736(int arg0, class17 arg1) {
      try {
         if (arg0 != -19501) {
            field7146 = 22;
         }

         this.field7153.method5317(arg1, -113);
         ++field7149;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7165[8] + arg0 + ',' + (arg1 != null ? field7165[4] : field7165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method724(int arg0) {
      try {
         ++field7139;
         if (arg0 != 23976) {
            this.method718(53, -8, 59, (class17)null);
         }

         return this.field7153.field10464;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7165[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
