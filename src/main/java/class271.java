import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class271 {
   @OriginalMember(
      owner = "client!s",
      name = "f",
      descriptor = "I"
   )
   public int field4383;
   @OriginalMember(
      owner = "client!s",
      name = "j",
      descriptor = "I"
   )
   public int field4379;
   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "I"
   )
   public int field4377;
   @OriginalMember(
      owner = "client!s",
      name = "g",
      descriptor = "I"
   )
   public int field4375;
   @OriginalMember(
      owner = "client!s",
      name = "h",
      descriptor = "[[I"
   )
   public int[][] field4373;
   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4384 = new String[]{method2318(method2317("\u0003Z5R")), method2318(method2317("\u0003Z7R")), method2318(method2317("\u0003Z?R")), method2318(method2317("\u001e\u0001\u001e\u0016")), method2318(method2317("\u0018\u0006H\u0016\u001c")), method2318(method2317("\u000bZ\\T\u0013")), method2318(method2317("\u0003Z4R")), method2318(method2317("\u0003Z1R")), method2318(method2317("\u0003Z8R")), method2318(method2317("\u0003ZN\u0013\u0000\u0019\u0000LR"))};
   @OriginalMember(
      owner = "client!s",
      name = "e",
      descriptor = "Luk;"
   )
   public static class498 field4381 = new class498(97, -2);
   @OriginalMember(
      owner = "client!s",
      name = "k",
      descriptor = "I"
   )
   public static int field4374;
   @OriginalMember(
      owner = "client!s",
      name = "c",
      descriptor = "I"
   )
   public static int field4376;
   @OriginalMember(
      owner = "client!s",
      name = "d",
      descriptor = "I"
   )
   public static int field4378;
   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "I"
   )
   public static int field4380;
   @OriginalMember(
      owner = "client!s",
      name = "i",
      descriptor = "I"
   )
   public static int field4382;

   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "(II)Lnca;",
      line = 5
   )
   public static final class257 method2311(int arg0, int arg1) {
      try {
         ++field4374;
         class257 var2 = (class257)class572.field8466.method2544(false, (long)arg1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class754.field11181.method5017(0, arg1, (byte)71);
            class257 var4 = new class257();
            if (var3 != null) {
               var4.method2172(new class354(var3), true);
            }

            var4.method2171((byte)94);
            if (arg0 >= -77) {
               method2316((byte)-59, (class102)null, 82);
            }

            class572.field8466.method2545((long)arg1, 117, var4);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4384[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III)I",
      line = 37
   )
   public final int method2312(int arg0, int arg1, int arg2) {
      try {
         ++field4378;
         int var4 = arg0 >> this.field4375;
         int var5 = arg1 >> this.field4375;
         if (~var4 <= -1 && var5 >= 0 && ~var4 >= ~(this.field4383 + -1) && var5 <= this.field4379 + -1) {
            int var6 = this.field4377 + -1 & arg0;
            int var7 = arg1 & this.field4377 + -1;
            int var8 = (-var6 + this.field4377) * this.field4373[var4][var5] + this.field4373[var4 + 1][var5] * var6 >> this.field4375;
            int var9 = 41 % ((arg2 - 5) / 53);
            int var10 = (-var6 + this.field4377) * this.field4373[var4][var5 + 1] + this.field4373[var4 + 1][var5 + 1] * var6 >> this.field4375;
            return (-var7 + this.field4377) * var8 - -(var7 * var10) >> this.field4375;
         } else {
            return 0;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field4384[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "(III)I",
      line = 63
   )
   public final int method2313(int arg0, int arg1, int arg2) {
      try {
         ++field4382;
         int var4 = -91 % ((arg0 - -75) / 40);
         return this.field4373[arg1][arg2];
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4384[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(BII)V",
      line = 77
   )
   public static final void method2314(byte arg0, int arg1, int arg2) {
      try {
         ++field4376;
         if (client.method1170(arg2, (byte)-119)) {
            class19.method143(-1, arg1, class296.field4672[arg2]);
            if (arg0 > -97) {
               field4381 = null;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4384[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(I)V",
      line = 91
   )
   public static void method2315(int arg0) {
      try {
         if (arg0 != 805306368) {
            field4381 = null;
         }

         field4381 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4384[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(BLpfa;I)Z",
      line = 102
   )
   public static final boolean method2316(byte arg0, class102 arg1, int arg2) {
      try {
         ++field4380;
         int var3 = arg1.method988((byte)-116, 2);
         if (~var3 == -1) {
            if (~arg1.method988((byte)-116, 1) != -1) {
               method2316((byte)-76, arg1, arg2);
            }

            int var4 = arg1.method988((byte)-116, 6);
            int var5 = arg1.method988((byte)-116, 6);
            boolean var6 = arg1.method988((byte)-116, 1) == 1;
            if (var6) {
               class213.field3236[class667.field9984++] = arg2;
            }

            if (class484.field7370[arg2] != null) {
               throw new RuntimeException(field4384[4]);
            } else {
               class240 var7 = class127.field1826[arg2];
               class9 var8 = class484.field7370[arg2] = new class9();
               var8.field1640 = arg2;
               if (class651.field9384[arg2] != null) {
                  var8.method48(class651.field9384[arg2], (byte)81);
               }

               var8.method1103(121, var7.field3634, true);
               var8.field1649 = var7.field3636;
               int var9 = var7.field3643;
               int var10 = var9 >> 28;
               int var11 = var9 >> 14 & 255;
               int var12 = 255 & var9;
               int var13 = (var11 << 6) + var4 + -class120.field1694;
               var8.field78 = var7.field3641;
               int var14 = (var12 << 6) + var5 + -class119.field1606;
               var8.field81 = var7.field3639;
               var8.field1687[0] = class417.field6452[arg2];
               var8.field1506 = var8.field1500 = (byte)var10;
               if (class577.method4326(var13, (byte)77, var14)) {
                  ++var8.field1500;
               }

               var8.method58(var13, 0, var14);
               var8.field107 = false;
               class127.field1826[arg2] = null;
               return true;
            }
         } else if (var3 == 1) {
            int var15 = arg1.method988((byte)-116, 2);
            int var16 = class127.field1826[arg2].field3643;
            class127.field1826[arg2].field3643 = ((var16 >> 28) + var15 << 28 & 805306368) + (var16 & 268435455);
            return false;
         } else if (var3 == 2) {
            int var17 = arg1.method988((byte)-116, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class127.field1826[arg2].field3643;
            int var21 = (var20 >> 28) - -var18 & 3;
            int var22 = (4182785 & var20) >> 14;
            int var23 = var20 & 255;
            if (~var19 == -1) {
               --var22;
               --var23;
            }

            if (var19 == 1) {
               --var23;
            }

            if (~var19 == -3) {
               --var23;
               ++var22;
            }

            if (var19 == 3) {
               --var22;
            }

            if (var19 == 4) {
               ++var22;
            }

            if (var19 == 5) {
               --var22;
               ++var23;
            }

            if (~var19 == -7) {
               ++var23;
            }

            if (~var19 == -8) {
               ++var22;
               ++var23;
            }

            class127.field1826[arg2].field3643 = (var21 << 28) + (var22 << 14) + var23;
            return false;
         } else {
            int var24 = arg1.method988((byte)-116, 18);
            int var25 = var24 >> 16;
            int var26 = (65522 & var24) >> 8;
            int var27 = 255 & var24;
            int var28 = class127.field1826[arg2].field3643;
            int var29 = (var28 >> 28) + var25 & 3;
            int var30 = (var28 >> 14) - -var26 & 255;
            int var31 = 255 & var27 + var28;
            if (arg0 != -76) {
               method2311(97, -83);
            }

            class127.field1826[arg2].field3643 = (var29 << 28) - -(var30 << 14) + var31;
            return false;
         }
      } catch (RuntimeException var33) {
         throw class482.method3757(var33, field4384[6] + arg0 + ',' + (arg1 != null ? field4384[5] : field4384[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "<init>",
      descriptor = "(III[[I)V",
      line = 286
   )
   public class271(int param1, int param2, int param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public abstract void method1130(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!s",
      name = "YA",
      descriptor = "()V"
   )
   public abstract void method1125();

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method1131(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

   @OriginalMember(
      owner = "client!s",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method1127(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Llja;[I)V"
   )
   public abstract void method1129(class404 arg0, int[] arg1);

   @OriginalMember(
      owner = "client!s",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public abstract class273 method1128(int arg0, int arg1, class273 arg2);

   @OriginalMember(
      owner = "client!s",
      name = "ka",
      descriptor = "(III)V"
   )
   public abstract void method1126(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public abstract boolean method1117(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public abstract void method1119(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @OriginalMember(
      owner = "client!s",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method1123(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method1121(int arg0, int arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public abstract void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

   @OriginalMember(
      owner = "client!s",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method1133(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2317(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2318(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
