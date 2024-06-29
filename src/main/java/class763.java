import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class763 implements class132 {
   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "Lhv;"
   )
   private class227 field11175 = new class227(128);
   @OriginalMember(
      owner = "client!vca",
      name = "n",
      descriptor = "[I"
   )
   private int[] field11178;
   @OriginalMember(
      owner = "client!vca",
      name = "f",
      descriptor = "[I"
   )
   public int[] field11170;
   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11181 = new String[]{method5535(method5534("cH\u0016V\u0002=")), method5535(method5534("cH\u0016V\u0007=")), method5535(method5534("cH\u0016V\u007f|E\u001e\f}=")), method5535(method5534("cH\u0016V\n=")), method5535(method5534("cH\u0016V\u0006=")), method5535(method5534("cH\u0016V\u0000=")), method5535(method5534("cH\u0016V\u0004=")), method5535(method5534("cH\u0016V\u0001=")), method5535(method5534("cH\u0016V\u000b=")), method5535(method5534("cH\u0016V\u0005="))};
   @OriginalMember(
      owner = "client!vca",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field11168 = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
   @OriginalMember(
      owner = "client!vca",
      name = "d",
      descriptor = "Ldp;"
   )
   public static class499 field11167 = new class499(1, 2);
   @OriginalMember(
      owner = "client!vca",
      name = "e",
      descriptor = "Lhv;"
   )
   public static class227 field11177 = new class227(16);
   @OriginalMember(
      owner = "client!vca",
      name = "l",
      descriptor = "I"
   )
   public static int field11169;
   @OriginalMember(
      owner = "client!vca",
      name = "h",
      descriptor = "I"
   )
   public static int field11171;
   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "I"
   )
   public static int field11172;
   @OriginalMember(
      owner = "client!vca",
      name = "m",
      descriptor = "I"
   )
   public static int field11173;
   @OriginalMember(
      owner = "client!vca",
      name = "k",
      descriptor = "I"
   )
   public static int field11174;
   @OriginalMember(
      owner = "client!vca",
      name = "j",
      descriptor = "I"
   )
   public static int field11176;
   @OriginalMember(
      owner = "client!vca",
      name = "i",
      descriptor = "I"
   )
   public static int field11179;
   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "I"
   )
   public static int field11180;

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "(IZ)I"
   )
   public final int method5527(int arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         ++field11180;
         long var4 = class163.method1353(-128);
         if (arg0 <= 30) {
            this.method5532(-104, 11, -77);
         }

         class779 var6 = arg1 ? (class779)this.field11175.method1817(-37) : (class779)this.field11175.method1812(353);
         int var10000;
         if (var3) {
            long var10;
            var10000 = (var10 = (4611686018427387903L & var6.field11356) - var4) == 0L ? 0 : (var10 < 0L ? -1 : 1);
         } else if (var6 == null) {
            var10000 = -1;
            if (!var3) {
               return -1;
            }
         } else {
            long var11;
            var10000 = (var11 = (4611686018427387903L & var6.field11356) - var4) == 0L ? 0 : (var11 < 0L ? -1 : 1);
         }

         while(true) {
            if (var10000 < 0) {
               if (~(var6.field11356 & 4611686018427387904L) != -1L) {
                  int var7 = (int)var6.field9965;
                  this.field11170[var7] = this.field11178[var7];
                  var6.method4924(-2970);
                  return var7;
               }

               var6.method4924(-2970);
            }

            var6 = (class779)this.field11175.method1812(353);
            if (var6 == null) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               long var12;
               var10000 = (var12 = (4611686018427387903L & var6.field11356) - var4) == 0L ? 0 : (var12 < 0L ? -1 : 1);
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field11181[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5528(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field11179;
         if (arg0 != 44) {
            this.field11175 = null;
         }

         int var3 = 0;
         if (!var2 && class496.field6922.field6365 <= var3) {
            this.field11175 = new class227(128);
         } else {
            do {
               class209 var4 = class496.field6922.method3524(var3, true);
               if (var4 != null && var4.field2648 == 0) {
                  this.field11178[var3] = 0;
                  this.field11170[var3] = 0;
               }

               ++var3;
            } while(class496.field6922.field6365 > var3);

            this.field11175 = new class227(128);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11181[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method1117(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            method5531(33);
         }

         ++field11172;
         return this.field11170[arg0];
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11181[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method1118(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            field11168 = null;
         }

         ++field11169;
         class637 var3 = class781.field11387.method1662(-1, arg1);
         int var4 = var3.field9361;
         int var5 = var3.field9359;
         int var6 = var3.field9356;
         int var7 = class725.field10589[-var5 + var6];
         return var7 & this.field11170[var4] >> var5;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field11181[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method5529(int arg0, int arg1, byte arg2) {
      try {
         this.field11178[arg0] = arg1;
         ++field11173;
         class779 var4 = (class779)this.field11175.method1818(-1, (long)arg0);
         if (arg2 <= 77) {
            method5531(74);
         }

         if (var4 == null) {
            class779 var5 = new class779(4611686018427387905L);
            this.field11175.method1808((long)arg0, var5, 26459);
         } else if (~var4.field11356 != -4611686018427387906L) {
            var4.field11356 = class163.method1353(-123) + 500L | 4611686018427387904L;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11181[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "(III)V"
   )
   public final void method5530(int arg0, int arg1, int arg2) {
      try {
         ++field11174;
         if (arg2 != -4586) {
            this.method5528((byte)-34);
         }

         class637 var4 = class781.field11387.method1662(-1, arg1);
         int var5 = var4.field9361;
         int var6 = var4.field9359;
         int var7 = var4.field9356;
         int var8 = class725.field10589[var7 - var6];
         if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
         }

         int var9 = var8 << var6;
         this.method5532(var5, 0, this.field11170[var5] & ~var9 | arg0 << var6 & var9);
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field11181[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5531(int arg0) {
      try {
         field11177 = null;
         field11168 = null;
         field11167 = null;
         if (arg0 != 36068) {
            field11168 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11181[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method5532(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == 0) {
            this.field11170[arg0] = arg2;
            ++field11176;
            class779 var4 = (class779)this.field11175.method1818(arg1 + -1, (long)arg0);
            if (var4 != null) {
               var4.field11356 = 500L + class163.method1353(arg1 + -124);
            } else {
               class779 var5 = new class779(500L + class163.method1353(-120));
               this.field11175.method1808((long)arg0, var5, 26459);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11181[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method5533(int arg0, int arg1, int arg2) {
      try {
         ++field11171;
         class637 var4 = class781.field11387.method1662(-1, arg2);
         int var5 = var4.field9361;
         int var6 = var4.field9359;
         int var7 = var4.field9356;
         int var8 = class725.field10589[-var6 + var7];
         if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
         }

         if (arg1 < 68) {
            this.field11178 = null;
         }

         int var9 = var8 << var6;
         this.method5529(var5, arg0 << var6 & var9 | ~var9 & this.field11178[var5], (byte)84);
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field11181[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "<init>",
      descriptor = "()V"
   )
   public class763() {
      try {
         this.field11178 = new int[class496.field6922.field6365];
         this.field11170 = new int[class496.field6922.field6365];
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11181[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5534(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5535(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
