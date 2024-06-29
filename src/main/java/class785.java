import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class785 extends class76 {
   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "Z"
   )
   public boolean field11519 = true;
   @OriginalMember(
      owner = "client!fja",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11533 = new String[]{method5665(method5664("y\u001d1\u0014")), method5665(method5664("q\u0002<V$?")), method5665(method5664("lFsV\u000b")), method5665(method5664("q\u0002<V5?")), method5665(method5664("q\u0002<V&?")), method5665(method5664("q\u0002<V>?")), method5665(method5664("q\u0002<V7?")), method5665(method5664("q\u0002<V1?")), method5665(method5664("q\u0002<V3?")), method5665(method5664("q\u0002<V'?")), method5665(method5664("9Fs")), method5665(method5664("q\u0002<V0?")), method5665(method5664("q\u0002<V4?")), method5665(method5664("q\u0002<V2?")), method5665(method5664("q\u0002<V9?"))};
   @OriginalMember(
      owner = "client!fja",
      name = "B",
      descriptor = "I"
   )
   public static int field11521 = 0;
   @OriginalMember(
      owner = "client!fja",
      name = "N",
      descriptor = "I"
   )
   public static int field11522 = 0;
   @OriginalMember(
      owner = "client!fja",
      name = "E",
      descriptor = "Z"
   )
   public static boolean field11529 = false;
   @OriginalMember(
      owner = "client!fja",
      name = "M",
      descriptor = "I"
   )
   public static int field11512;
   @OriginalMember(
      owner = "client!fja",
      name = "R",
      descriptor = "I"
   )
   public static int field11513;
   @OriginalMember(
      owner = "client!fja",
      name = "K",
      descriptor = "I"
   )
   public static int field11514;
   @OriginalMember(
      owner = "client!fja",
      name = "Q",
      descriptor = "I"
   )
   public static int field11515;
   @OriginalMember(
      owner = "client!fja",
      name = "O",
      descriptor = "I"
   )
   public static int field11516;
   @OriginalMember(
      owner = "client!fja",
      name = "D",
      descriptor = "I"
   )
   public static int field11518;
   @OriginalMember(
      owner = "client!fja",
      name = "S",
      descriptor = "I"
   )
   public static int field11523;
   @OriginalMember(
      owner = "client!fja",
      name = "P",
      descriptor = "I"
   )
   public static int field11524;
   @OriginalMember(
      owner = "client!fja",
      name = "G",
      descriptor = "I"
   )
   public static int field11525;
   @OriginalMember(
      owner = "client!fja",
      name = "U",
      descriptor = "I"
   )
   public static int field11526;
   @OriginalMember(
      owner = "client!fja",
      name = "I",
      descriptor = "I"
   )
   public static int field11528;
   @OriginalMember(
      owner = "client!fja",
      name = "H",
      descriptor = "I"
   )
   public static int field11532;
   @OriginalMember(
      owner = "client!fja",
      name = "F",
      descriptor = "Leja;"
   )
   public class766 field11511;
   @OriginalMember(
      owner = "client!fja",
      name = "J",
      descriptor = "[I"
   )
   private int[] field11520;
   @OriginalMember(
      owner = "client!fja",
      name = "C",
      descriptor = "[I"
   )
   public int[] field11530;
   @OriginalMember(
      owner = "client!fja",
      name = "A",
      descriptor = "[Lcba;"
   )
   public static class577[] field11517;
   @OriginalMember(
      owner = "client!fja",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field11527;
   @OriginalMember(
      owner = "client!fja",
      name = "T",
      descriptor = "[[I"
   )
   private int[][] field11531;

   @OriginalMember(
      owner = "client!fja",
      name = "e",
      descriptor = "(B)V",
      line = 4
   )
   public static void method5652(byte arg0) {
      try {
         if (arg0 > -17) {
            field11529 = false;
         }

         field11517 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11533[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(IIB)I",
      line = 16
   )
   public final int method5653(int arg0, int arg1, byte arg2) {
      try {
         ++field11526;
         if (arg2 >= -23) {
            return 66;
         } else if (this.field11520 != null && ~arg0 <= -1 && this.field11520.length >= arg0) {
            return this.field11531[arg0] != null && ~arg1 <= -1 && this.field11531[arg0].length >= arg1 ? this.field11531[arg0][arg1] : -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11533[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "(Lwf;I)V",
      line = 35
   )
   public final void method5654(class147 arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 != 0) {
            field11522 = -116;
         }

         ++field11532;

         do {
            int var4 = arg0.method1143(-15465);
            if (var4 == 0) {
               break;
            }

            this.method5661(false, var4, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11533[4] + (arg0 != null ? field11533[2] : field11533[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "c",
      descriptor = "(B)I",
      line = 57
   )
   public final int method5655(byte arg0) {
      try {
         ++field11514;
         if (this.field11520 == null) {
            return 0;
         } else {
            int var2 = -90 % ((arg0 - 18) / 35);
            return this.field11520.length;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11533[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(IIII)V",
      line = 70
   )
   public static final void method5656(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var7 = arg1 << 3;
         ++field11523;
         int var9 = arg3 << 3;
         int var8 = arg2 << 3;
         class117.field1467 = (float)var9;
         class273.field3753 = (float)var7;
         int var4 = 15 % ((arg0 - -1) / 36);
         if (class380.field5481 == 2) {
            class207.field2966 = var7;
            class723.field10552 = var8;
            class10.field96 = var9;
         }

         class591.method4298(262144);
         class444.field6311 = true;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11533[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(Z)V",
      line = 102
   )
   public final void method5657(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0) {
            field11521 = -74;
         }

         if (this.field11530 != null) {
            int var3 = 0;
            if (var2 || ~var3 > ~this.field11530.length) {
               do {
                  this.field11530[var3] = class300.method2238(this.field11530[var3], 32768);
                  ++var3;
               } while(~var3 > ~this.field11530.length);
            }
         }

         ++field11524;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11533[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(II[I[IILea;)Lid;",
      line = 123
   )
   public static final class612 method5658(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, class573 arg5) {
      boolean var6 = client.field4360;

      try {
         ++field11516;
         byte[] var7 = new byte[arg1 * arg4];
         int var8 = arg0;
         if (!var6 && ~arg0 <= ~arg1) {
            return new class612(arg5, arg4, arg1, var7);
         } else {
            do {
               int var9 = arg4 * var8 + arg3[var8];
               int var10 = 0;
               if (var6) {
                  var7[var9++] = -1;
                  ++var10;
               }

               while(true) {
                  while(var10 < arg2[var8]) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  if (!var6) {
                     ++var8;
                     break;
                  }

                  ++var10;
               }
            } while(~var8 > ~arg1);

            return new class612(arg5, arg4, arg1, var7);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field11533[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11533[2] : field11533[0]) + ',' + (arg3 != null ? field11533[2] : field11533[0]) + ',' + arg4 + ',' + (arg5 != null ? field11533[2] : field11533[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "d",
      descriptor = "(B)Ljava/lang/String;",
      line = 150
   )
   public final String method5659(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11528;
         StringBuffer var3 = new StringBuffer(80);
         if (this.field11527 == null) {
            return "";
         } else {
            var3.append(this.field11527[0]);
            if (arg0 <= 117) {
               field11522 = 70;
            }

            int var4 = 1;
            if (var2) {
               var3.append(field11533[10]);
               var3.append(this.field11527[var4]);
               ++var4;
            }

            while(true) {
               while(~this.field11527.length < ~var4) {
                  var3.append(field11533[10]);
                  var3.append(this.field11527[var4]);
                  ++var4;
               }

               if (!var2) {
                  return var3.toString();
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11533[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(II)Lwu;",
      line = 188
   )
   public final class395 method5660(int arg0, int arg1) {
      try {
         ++field11525;
         if (this.field11520 != null && ~arg0 <= -1 && ~arg0 >= ~this.field11520.length) {
            int var3 = -49 % ((arg1 - 65) / 59);
            return class623.method4529(this.field11520[arg0], false);
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11533[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(ZILwf;)V",
      line = 201
   )
   private final void method5661(boolean arg0, int arg1, class147 arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg0) {
            method5656(-78, 17, 2, 25);
         }

         ++field11515;
         if (arg1 != 1) {
            if (~arg1 == -3) {
               int var5 = arg2.method1143(-15465);
               this.field11530 = new int[var5];
               int var6 = 0;
               if (var4) {
                  this.field11530[var6] = arg2.method1211(-26166);
                  ++var6;
               }

               while(true) {
                  while(var5 > var6) {
                     this.field11530[var6] = arg2.method1211(-26166);
                     ++var6;
                  }

                  if (!var4) {
                     return;
                  }

                  ++var6;
               }
            }

            if (arg1 == 3) {
               int var7 = arg2.method1143(-15465);
               this.field11531 = new int[var7][];
               this.field11520 = new int[var7];
               int var8 = 0;
               if (!var4 && ~var8 <= ~var7) {
                  return;
               }

               do {
                  int var9 = arg2.method1211(-26166);
                  class395 var10 = class623.method4529(var9, false);
                  if (var10 == null) {
                     ++var8;
                  } else {
                     this.field11520[var8] = var9;
                     this.field11531[var8] = new int[var10.field5705];
                     int var11 = 0;
                     if (var4) {
                        this.field11531[var8][var11] = arg2.method1211(-26166);
                        ++var11;
                     }

                     while(var10.field5705 > var11) {
                        this.field11531[var8][var11] = arg2.method1211(-26166);
                        ++var11;
                     }

                     ++var8;
                  }
               } while(~var8 > ~var7);

               return;
            }

            if (arg1 == 4) {
               this.field11519 = false;
               return;
            }
         } else {
            this.field11527 = class527.method3811(-29619, arg2.method1204(2119550368), '<');
         }

      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field11533[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11533[2] : field11533[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(Lwf;I)Ljava/lang/String;",
      line = 275
   )
   public final String method5662(class147 arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field11513;
         StringBuffer var4 = new StringBuffer(80);
         if (this.field11520 != null) {
            int var5 = 0;
            if (var3 || var5 < this.field11520.length) {
               do {
                  var4.append(this.field11527[var5]);
                  var4.append(this.field11511.method5545(this.field11531[var5], this.method5660(var5, -27), arg0.method1151(0, class623.method4529(this.field11520[var5], false).field5709), -113));
                  ++var5;
               } while(var5 < this.field11520.length);
            }
         }

         var4.append(this.field11527[this.field11527.length + arg1]);
         return var4.toString();
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11533[8] + (arg0 != null ? field11533[2] : field11533[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(Lwf;[IZ)V",
      line = 307
   )
   public final void method5663(class147 arg0, int[] arg1, boolean arg2) {
      boolean var4 = client.field4360;

      try {
         ++field11518;
         if (this.field11520 != null) {
            if (!arg2) {
               this.field11511 = null;
            }

            int var5 = 0;
            if (!var4) {
               if (var5 >= this.field11520.length) {
                  return;
               }

               if (var5 >= arg1.length) {
                  return;
               }
            }

            do {
               int var6 = this.method5660(var5, -74).field5704;
               if (~var6 < -1) {
                  arg0.method1148((long)arg1[var5], false, var6);
               }

               ++var5;
               if (var5 >= this.field11520.length) {
                  return;
               }
            } while(var5 < arg1.length);

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11533[3] + (arg0 != null ? field11533[2] : field11533[0]) + ',' + (arg1 != null ? field11533[2] : field11533[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5664(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5665(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
