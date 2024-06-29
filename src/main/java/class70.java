import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class class70 extends class294 {
   @OriginalMember(
      owner = "client!sw",
      name = "t",
      descriptor = "[Lsw;"
   )
   public class70[] field915;
   @OriginalMember(
      owner = "client!sw",
      name = "q",
      descriptor = "Z"
   )
   public boolean field933;
   @OriginalMember(
      owner = "client!sw",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field934 = new String[]{method547(method546("2e>d")), method547(method546("/g|@S")), method547(method546("'>|&\u0006")), method547(method546("/g|FS")), method547(method546("/g|4\u00122y&6S")), method547(method546("/g|JS")), method547(method546("/g|BS")), method547(method546("\bx;{[3`7z\u001a(y=f[8\u007f7{[2\u007f&(\u0013=f7(\u001a|s=d\u0014)brg\u000e(`'|")), method547(method546("/g|ZS")), method547(method546("\bx;{[3`7z\u001a(y=f[8\u007f7{[2\u007f&(\u0013=f7(\u001a|}=f\u0014?x g\u001690=}\u000f,e&")), method547(method546("/g|KS")), method547(method546("/g|XS")), method547(method546("/g|GS")), method547(method546("/g|ES")), method547(method546("/g|YS")), method547(method546("/g|[S")), method547(method546("/g|DS"))};
   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field917 = new int[32];
   @OriginalMember(
      owner = "client!sw",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field922 = false;
   @OriginalMember(
      owner = "client!sw",
      name = "x",
      descriptor = "I"
   )
   public static int field916;
   @OriginalMember(
      owner = "client!sw",
      name = "y",
      descriptor = "I"
   )
   public int field920;
   @OriginalMember(
      owner = "client!sw",
      name = "w",
      descriptor = "I"
   )
   public static int field921;
   @OriginalMember(
      owner = "client!sw",
      name = "s",
      descriptor = "I"
   )
   public static int field924;
   @OriginalMember(
      owner = "client!sw",
      name = "A",
      descriptor = "I"
   )
   public static int field925;
   @OriginalMember(
      owner = "client!sw",
      name = "C",
      descriptor = "I"
   )
   public static int field926;
   @OriginalMember(
      owner = "client!sw",
      name = "D",
      descriptor = "I"
   )
   public static int field927;
   @OriginalMember(
      owner = "client!sw",
      name = "B",
      descriptor = "I"
   )
   public static int field928;
   @OriginalMember(
      owner = "client!sw",
      name = "n",
      descriptor = "I"
   )
   public static int field929;
   @OriginalMember(
      owner = "client!sw",
      name = "o",
      descriptor = "I"
   )
   public static int field930;
   @OriginalMember(
      owner = "client!sw",
      name = "v",
      descriptor = "I"
   )
   public static int field931;
   @OriginalMember(
      owner = "client!sw",
      name = "r",
      descriptor = "I"
   )
   public static int field932;
   @OriginalMember(
      owner = "client!sw",
      name = "m",
      descriptor = "Llba;"
   )
   public class408 field918;
   @OriginalMember(
      owner = "client!sw",
      name = "E",
      descriptor = "Ljt;"
   )
   public class478 field923;
   @OriginalMember(
      owner = "client!sw",
      name = "u",
      descriptor = "Lrr;"
   )
   public static class678 field919;

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(II)[[I"
   )
   public int[][] method537(int arg0, int arg1) {
      try {
         if (arg0 != 32) {
            this.method538(-7, 78, 34);
         }

         ++field926;
         throw new IllegalStateException(field934[7]);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field934[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field928;
         if (arg0 != -1) {
            this.field933 = false;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field934[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field934[2] : field934[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(Z)V"
   )
   public void method275(boolean arg0) {
      try {
         if (arg0) {
            field922 = true;
         }

         ++field929;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field934[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(III)V"
   )
   public void method538(int arg0, int arg1, int arg2) {
      try {
         ++field924;
         int var4 = ~this.field920 != -256 ? this.field920 : arg0;
         if (arg1 > -69) {
            this.field923 = null;
         }

         if (this.field933) {
            this.field923 = new class478(var4, arg0, arg2);
         } else {
            this.field918 = new class408(var4, arg0, arg2);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field934[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(ZII)[[I"
   )
   public final int[][] method539(boolean arg0, int arg1, int arg2) {
      try {
         ++field921;
         if (!arg0) {
            field919 = null;
         }

         if (this.field915[arg2].field933) {
            int[] var4 = this.field915[arg2].method8((byte)87, arg1);
            return new int[][]{var4, var4, var4};
         } else {
            return this.field915[arg2].method537(32, arg1);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field934[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(B)I"
   )
   public int method540(byte arg0) {
      try {
         if (arg0 != 107) {
            return -97;
         } else {
            ++field932;
            return -1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field934[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(I)V"
   )
   public void method541(int arg0) {
      try {
         label16: {
            if (this.field933) {
               this.field923.method3720(121);
               this.field923 = null;
               if (!client.field1786) {
                  break label16;
               }
            }

            this.field918.method3275(-11950);
            this.field918 = null;
         }

         ++field930;
         int var2 = -46 % ((arg0 - 7) / 60);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field934[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "c",
      descriptor = "(I)I"
   )
   public int method542(int arg0) {
      try {
         ++field931;
         if (arg0 != -1) {
            this.method274(-36, -2, (class354)null);
         }

         return -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field934[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method543(int arg0) {
      try {
         if (arg0 < 32) {
            field917 = null;
         }

         field919 = null;
         field917 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field934[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(BI)[I"
   )
   public int[] method8(byte arg0, int arg1) {
      try {
         ++field927;
         if (arg0 != 87) {
            this.method8((byte)44, -17);
         }

         throw new IllegalStateException(field934[9]);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field934[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(Lica;Lsu;II)V"
   )
   public static final void method544(class354 param0, class289 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sw",
      name = "a",
      descriptor = "(IIB)[I"
   )
   public final int[] method545(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 > -38) {
            return null;
         } else {
            ++field925;
            return this.field915[arg0].field933 ? this.field915[arg0].method8((byte)87, arg1) : this.field915[arg0].method537(32, arg1)[0];
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field934[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class70(int arg0, boolean arg1) {
      try {
         this.field915 = new class70[arg0];
         this.field933 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field934[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method546(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method547(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
