import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public abstract class class70 extends class673 {
   @OriginalMember(
      owner = "client!sja",
      name = "t",
      descriptor = "Z"
   )
   public boolean field930;
   @OriginalMember(
      owner = "client!sja",
      name = "A",
      descriptor = "[Lsja;"
   )
   public class70[] field935;
   @OriginalMember(
      owner = "client!sja",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field948 = new String[]{method699(method698("T5.aU\u000f")), method699(method698("T5.aN\u000f")), method699(method698("\\qaaz")), method699(method698("I*##")), method699(method698("T5.aS\u000f")), method699(method698("T5.aH\u000f")), method699(method698("s7&<'H/*=fS6 !'C0*<'I0;ooF)*of\u00072 !hD7= jB\u007f :sW*;")), method699(method698("T5.a;N1&;9\u000f")), method699(method698("T5.aFfw")), method699(method698("T5.aT\u000f")), method699(method698("T5.aQ\u000f")), method699(method698("T5.aA\u000f")), method699(method698("T5.aW\u000f")), method699(method698("T5.aV\u000f")), method699(method698("T5.aR\u000f")), method699(method698("T5.aF\u000f")), method699(method698("T5.aD\u000f")), method699(method698("T5.aE\u000f")), method699(method698("s7&<'H/*=fS6 !'C0*<'I0;ooF)*of\u0007< #hR-o rS/:;")), method699(method698("T5.aK\u000f")), method699(method698("T5.aP\u000f"))};
   @OriginalMember(
      owner = "client!sja",
      name = "B",
      descriptor = "Z"
   )
   public static boolean field931 = false;
   @OriginalMember(
      owner = "client!sja",
      name = "r",
      descriptor = "I"
   )
   public static int field925;
   @OriginalMember(
      owner = "client!sja",
      name = "D",
      descriptor = "I"
   )
   public static int field927;
   @OriginalMember(
      owner = "client!sja",
      name = "q",
      descriptor = "I"
   )
   public static int field928;
   @OriginalMember(
      owner = "client!sja",
      name = "o",
      descriptor = "I"
   )
   public static int field929;
   @OriginalMember(
      owner = "client!sja",
      name = "F",
      descriptor = "I"
   )
   public static int field932;
   @OriginalMember(
      owner = "client!sja",
      name = "x",
      descriptor = "I"
   )
   public static int field933;
   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "I"
   )
   public static int field934;
   @OriginalMember(
      owner = "client!sja",
      name = "p",
      descriptor = "I"
   )
   public static int field936;
   @OriginalMember(
      owner = "client!sja",
      name = "l",
      descriptor = "I"
   )
   public static int field937;
   @OriginalMember(
      owner = "client!sja",
      name = "w",
      descriptor = "I"
   )
   public int field938;
   @OriginalMember(
      owner = "client!sja",
      name = "u",
      descriptor = "I"
   )
   public static int field939;
   @OriginalMember(
      owner = "client!sja",
      name = "v",
      descriptor = "I"
   )
   public static int field941;
   @OriginalMember(
      owner = "client!sja",
      name = "G",
      descriptor = "I"
   )
   public static int field942;
   @OriginalMember(
      owner = "client!sja",
      name = "C",
      descriptor = "I"
   )
   public static int field943;
   @OriginalMember(
      owner = "client!sja",
      name = "s",
      descriptor = "I"
   )
   public static int field944;
   @OriginalMember(
      owner = "client!sja",
      name = "y",
      descriptor = "I"
   )
   public static int field945;
   @OriginalMember(
      owner = "client!sja",
      name = "m",
      descriptor = "I"
   )
   public static int field946;
   @OriginalMember(
      owner = "client!sja",
      name = "H",
      descriptor = "I"
   )
   public static int field947;
   @OriginalMember(
      owner = "client!sja",
      name = "E",
      descriptor = "Luw;"
   )
   public class14 field940;
   @OriginalMember(
      owner = "client!sja",
      name = "n",
      descriptor = "Loba;"
   )
   public class363 field926;

   @OriginalMember(
      owner = "client!sja",
      name = "d",
      descriptor = "(I)V"
   )
   public void method552(int arg0) {
      try {
         ++field946;
         if (arg0 >= -36) {
            this.field935 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field948[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method686(int arg0, char arg1) {
      boolean var2 = client.field1481;

      try {
         ++field927;
         if (~arg1 < arg0 && arg1 < 128 || arg1 >= 160 && ~arg1 >= -256) {
            return true;
         } else {
            if (arg1 != 0) {
               char[] var3 = class497.field6956;
               int var4 = 0;
               if (var2 || ~var3.length < ~var4) {
                  do {
                     char var5 = var3[var4];
                     if (arg1 == var5) {
                        return true;
                     }

                     ++var4;
                  } while(~var3.length < ~var4);
               }
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field948[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(I)I"
   )
   public int method687(int arg0) {
      try {
         ++field939;
         return arg0 != 0 ? -116 : -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field948[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "(Z)V"
   )
   public void method688(boolean arg0) {
      try {
         ++field937;
         if (arg0) {
            this.field935 = null;
         }

         if (!this.field930) {
            this.field926.method2857(false);
            this.field926 = null;
         } else {
            this.field940.method118(-78);
            this.field940 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field948[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(Z)I"
   )
   public int method689(boolean arg0) {
      try {
         ++field932;
         return arg0 ? 47 : -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field948[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(III)[I"
   )
   public final int[] method690(int arg0, int arg1, int arg2) {
      try {
         ++field947;
         int var4 = -37 / ((-13 - arg0) / 33);
         return !this.field935[arg1].field930 ? this.field935[arg1].method547(-6752, arg2)[0] : this.field935[arg1].method331((byte)-63, arg2);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field948[20] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(Lkw;I)V"
   )
   public static final void method691(class9 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sja",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method692(int arg0) {
      try {
         if (arg0 >= 86) {
            class541.field7902.method3201((byte)-34);
            ++field936;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field948[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(BI)[I"
   )
   public int[] method331(byte arg0, int arg1) {
      try {
         if (arg0 != -63) {
            method691((class9)null, -108);
         }

         ++field929;
         throw new IllegalStateException(field948[6]);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field948[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "(III)V"
   )
   public void method693(int arg0, int arg1, int arg2) {
      try {
         ++field945;
         int var4 = this.field938 != 255 ? this.field938 : arg2;
         if (arg0 != 32767) {
            this.field930 = true;
         }

         if (this.field930) {
            this.field940 = new class14(var4, arg2, arg1);
         } else {
            this.field926 = new class363(var4, arg2, arg1);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field948[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method694(int arg0) {
      try {
         ++field941;
         if (arg0 != 0) {
            method691((class9)null, -70);
         }

         class587.method4374(-1);
         class20.field318 = null;
         class58.field762 = null;
         class475.field6627 = null;
         class199.field2536 = null;
         class577.field8555 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field948[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(II)[[I"
   )
   public int[][] method547(int arg0, int arg1) {
      try {
         if (arg0 != -6752) {
            this.method696(-95, 85, -86);
         }

         ++field928;
         throw new IllegalStateException(field948[18]);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field948[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(ZLoca;)V"
   )
   public static final void method695(boolean arg0, class642 arg1) {
      try {
         if (~arg1.field9493 == -6 && arg1.field9524 != -1) {
            class281.method2269(class629.field9294, !arg0, arg1);
         }

         ++field925;
         if (arg0) {
            method695(true, (class642)null);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field948[10] + arg0 + ',' + (arg1 != null ? field948[2] : field948[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "c",
      descriptor = "(III)[[I"
   )
   public final int[][] method696(int arg0, int arg1, int arg2) {
      try {
         ++field944;
         if (arg2 != 32767) {
            this.method550(66, (class66)null, 4);
         }

         if (this.field935[arg1].field930) {
            int[] var4 = this.field935[arg1].method331((byte)-63, arg0);
            return new int[][]{var4, var4, var4};
         } else {
            return this.field935[arg1].method547(arg2 ^ -26017, arg0);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field948[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg0 > -34) {
            this.field930 = false;
         }

         ++field943;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field948[16] + arg0 + ',' + (arg1 != null ? field948[2] : field948[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class70(int arg0, boolean arg1) {
      try {
         this.field930 = arg1;
         this.field935 = new class70[arg0];
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field948[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method697(int arg0) {
      try {
         ++field933;
         if (class385.method3048(class157.field2022, (byte)-67)) {
            class367.method2893(false, 255);
         } else {
            class520.field7313 = class387.field5365.field8760;
            if (arg0 >= -14) {
               field931 = false;
            }

            class387.field5365.field8760 = null;
            class577.method4324((byte)-126, 14);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field948[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method698(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method699(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
