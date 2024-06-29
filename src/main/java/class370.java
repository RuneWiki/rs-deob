import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class370 {
   @OriginalMember(
      owner = "client!kh",
      name = "x",
      descriptor = "Llja;"
   )
   private class728 field5152 = new class728();
   @OriginalMember(
      owner = "client!kh",
      name = "d",
      descriptor = "Llja;"
   )
   private class728 field5164 = new class728();
   @OriginalMember(
      owner = "client!kh",
      name = "e",
      descriptor = "Llja;"
   )
   private class728 field5168 = new class728();
   @OriginalMember(
      owner = "client!kh",
      name = "C",
      descriptor = "Llja;"
   )
   private class728 field5172 = new class728();
   @OriginalMember(
      owner = "client!kh",
      name = "j",
      descriptor = "Lgea;"
   )
   private class66 field5173 = new class66(4);
   @OriginalMember(
      owner = "client!kh",
      name = "D",
      descriptor = "I"
   )
   public volatile int field5177 = 0;
   @OriginalMember(
      owner = "client!kh",
      name = "w",
      descriptor = "I"
   )
   public volatile int field5178 = 0;
   @OriginalMember(
      owner = "client!kh",
      name = "u",
      descriptor = "B"
   )
   private byte field5180 = 0;
   @OriginalMember(
      owner = "client!kh",
      name = "y",
      descriptor = "Lgea;"
   )
   private class66 field5179 = new class66(8);
   @OriginalMember(
      owner = "client!kh",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5182 = new String[]{method2931(method2930("C_/IF")), method2931(method2930("C_/MF")), method2931(method2930("C_/KF")), method2931(method2930("C_/HF")), method2931(method2930("C_/@F")), method2931(method2930("C_/GF")), method2931(method2930("C_/JF")), method2931(method2930("C_/LF")), method2931(method2930("C_/FF")), method2931(method2930("C_/AF")), method2931(method2930("C_/NF")), method2931(method2930("C_/OF")), method2931(method2930("S\u0019/,\u0013")), method2931(method2930("FBmn")), method2931(method2930("C_/CF")), method2931(method2930("C_/DF")), method2931(method2930("C_/EF"))};
   @OriginalMember(
      owner = "client!kh",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field5154 = false;
   @OriginalMember(
      owner = "client!kh",
      name = "m",
      descriptor = "I"
   )
   public static int field5151;
   @OriginalMember(
      owner = "client!kh",
      name = "o",
      descriptor = "I"
   )
   public static int field5153;
   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "I"
   )
   public static int field5155;
   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "I"
   )
   public static int field5156;
   @OriginalMember(
      owner = "client!kh",
      name = "t",
      descriptor = "I"
   )
   public static int field5158;
   @OriginalMember(
      owner = "client!kh",
      name = "v",
      descriptor = "I"
   )
   public static int field5159;
   @OriginalMember(
      owner = "client!kh",
      name = "n",
      descriptor = "I"
   )
   public static int field5160;
   @OriginalMember(
      owner = "client!kh",
      name = "r",
      descriptor = "I"
   )
   public static int field5161;
   @OriginalMember(
      owner = "client!kh",
      name = "l",
      descriptor = "I"
   )
   public static int field5163;
   @OriginalMember(
      owner = "client!kh",
      name = "h",
      descriptor = "I"
   )
   public static int field5165;
   @OriginalMember(
      owner = "client!kh",
      name = "f",
      descriptor = "I"
   )
   public static int field5166;
   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "I"
   )
   public static int field5167;
   @OriginalMember(
      owner = "client!kh",
      name = "E",
      descriptor = "I"
   )
   public static int field5169;
   @OriginalMember(
      owner = "client!kh",
      name = "i",
      descriptor = "I"
   )
   public static int field5170;
   @OriginalMember(
      owner = "client!kh",
      name = "B",
      descriptor = "I"
   )
   public static int field5171;
   @OriginalMember(
      owner = "client!kh",
      name = "p",
      descriptor = "I"
   )
   private int field5176;
   @OriginalMember(
      owner = "client!kh",
      name = "s",
      descriptor = "J"
   )
   private long field5174;
   @OriginalMember(
      owner = "client!kh",
      name = "k",
      descriptor = "Lfd;"
   )
   private class471 field5175;
   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "Lpd;"
   )
   public static class648 field5157;
   @OriginalMember(
      owner = "client!kh",
      name = "g",
      descriptor = "Lbf;"
   )
   private class764 field5181;
   @OriginalMember(
      owner = "client!kh",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5162;

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2915(boolean arg0) {
      try {
         ++field5163;

         try {
            this.field5175.method3578(1);
         } catch (Exception var3) {
         }

         if (arg0) {
            field5154 = false;
         }

         ++this.field5177;
         this.field5180 = (byte)((int)(Math.random() * 255.0D + 1.0D));
         this.field5178 = -1;
         this.field5175 = null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5182[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method2916(int arg0, byte arg1) {
      try {
         if (arg1 > -4) {
            return -17;
         } else {
            ++field5161;
            return arg0 >>> 8;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5182[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method2917(int arg0) {
      try {
         ++field5166;
         if (arg0 != -5508) {
            this.field5164 = null;
         }

         return ~this.method2921(3) <= -21;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5182[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2918(byte arg0) {
      try {
         ++field5167;
         if (arg0 <= 12) {
            this.field5177 = -89;
         }

         if (this.field5175 != null) {
            this.field5175.method3579(-109);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5182[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(Lfd;ZI)V"
   )
   public final void method2919(class471 arg0, boolean arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (this.field5175 != null) {
            try {
               this.field5175.method3578(1);
            } catch (Exception var9) {
            }

            this.field5175 = null;
         }

         ++field5156;
         if (arg2 != 3) {
            this.method2924(false, -89);
         }

         this.field5175 = arg0;
         this.method2925(arg2 ^ 5);
         this.method2924(arg1, 200);
         this.field5181 = null;
         this.field5179.field864 = 0;

         label82:
         while(true) {
            class764 var5 = (class764)this.field5164.method5262(true);
            if (var5 != null) {
               this.field5152.method5267((byte)119, var5);
               if (!var4) {
                  if (!var4) {
                     continue;
                  }
               } else {
                  if (var5 == null) {
                     break;
                  }

                  this.field5168.method5267((byte)113, var5);
                  if (var4) {
                     return;
                  }

                  if (var4) {
                     break;
                  }
               }
            }

            while(true) {
               var5 = (class764)this.field5172.method5262(true);
               if (var5 == null) {
                  break label82;
               }

               this.field5168.method5267((byte)113, var5);
               if (var4) {
                  return;
               }

               if (var4) {
                  break label82;
               }
            }
         }

         if (this.field5180 != 0) {
            try {
               this.field5173.field864 = 0;
               this.field5173.method593(4, 867770704);
               this.field5173.method593(this.field5180, arg2 + 867770701);
               this.field5173.method611(0, -1344798296);
               this.field5175.method3571(4, 0, this.field5173.field859, 10);
            } catch (IOException var8) {
               try {
                  this.field5175.method3578(1);
               } catch (Exception var7) {
               }

               this.field5178 = -2;
               this.field5175 = null;
               ++this.field5177;
            }
         }

         this.field5176 = 0;
         this.field5174 = class163.method1353(-119);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field5182[11] + (arg0 != null ? field5182[12] : field5182[13]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2920(int arg0) {
      try {
         ++field5151;
         if (this.field5175 != null) {
            if (arg0 != 2418) {
               this.method2919((class471)null, false, 37);
            }

            try {
               this.field5173.field864 = 0;
               this.field5173.method593(7, 867770704);
               this.field5173.method637((byte)97, 0);
               this.field5175.method3571(4, 0, this.field5173.field859, 10);
            } catch (IOException var4) {
               try {
                  this.field5175.method3578(1);
               } catch (Exception var3) {
               }

               this.field5175 = null;
               ++this.field5177;
               this.field5178 = -2;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5182[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method2921(int arg0) {
      try {
         if (arg0 != 3) {
            return 116;
         } else {
            ++field5158;
            return this.field5152.method5263(0) - -this.field5164.method5263(0);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5182[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2922(boolean arg0) {
      try {
         field5162 = null;
         if (!arg0) {
            method2922(false);
         }

         field5157 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5182[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method2923(boolean arg0) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field5155;
            return ~this.method2929(-1) <= -21;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5182[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method2924(boolean arg0, int arg1) {
      try {
         ++field5169;
         if (arg1 != 200) {
            this.method2920(100);
         }

         if (this.field5175 != null) {
            try {
               this.field5173.field864 = 0;
               this.field5173.method593(!arg0 ? 3 : 2, arg1 ^ 867770776);
               this.field5173.method637((byte)108, 0);
               this.field5175.method3571(4, 0, this.field5173.field859, arg1 ^ 194);
            } catch (IOException var5) {
               try {
                  this.field5175.method3578(1);
               } catch (Exception var4) {
               }

               this.field5175 = null;
               this.field5178 = -2;
               ++this.field5177;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5182[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method2925(int arg0) {
      try {
         ++field5171;
         if (this.field5175 != null) {
            try {
               this.field5173.field864 = 0;
               this.field5173.method593(arg0, arg0 + 867770698);
               this.field5173.method637((byte)116, 3);
               this.field5175.method3571(4, 0, this.field5173.field859, 10);
            } catch (IOException var4) {
               try {
                  this.field5175.method3578(arg0 + -5);
               } catch (Exception var3) {
               }

               this.field5178 = -2;
               ++this.field5177;
               this.field5175 = null;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5182[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method2926(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(IBZII)Lbf;"
   )
   public final class764 method2927(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field5160;
         long var6 = (long)((arg3 << 16) + arg0);
         class764 var8 = new class764();
         var8.field275 = var6;
         var8.field11188 = arg1;
         if (arg4 != 0) {
            this.field5176 = 35;
         }

         var8.field11624 = arg2;
         if (!arg2) {
            if (~this.method2929(-1) <= -21) {
               throw new RuntimeException();
            }

            this.field5168.method5267((byte)121, var8);
            if (!client.field1481) {
               return var8;
            }
         }

         if (this.method2921(3) >= 20) {
            throw new RuntimeException();
         } else {
            this.field5152.method5267((byte)100, var8);
            return var8;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field5182[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2928(byte arg0) {
      try {
         ++field5165;
         if (arg0 != 85) {
            this.field5152 = null;
         }

         if (this.field5175 != null) {
            this.field5175.method3578(1);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5182[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "(I)I"
   )
   private final int method2929(int arg0) {
      try {
         if (arg0 != -1) {
            this.method2918((byte)-34);
         }

         ++field5159;
         return this.field5168.method5263(0) + this.field5172.method5263(0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5182[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2930(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2931(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
