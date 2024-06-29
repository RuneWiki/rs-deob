import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class570 {
   @OriginalMember(
      owner = "client!dr",
      name = "k",
      descriptor = "I"
   )
   private int field8432;
   @OriginalMember(
      owner = "client!dr",
      name = "h",
      descriptor = "J"
   )
   private long field8431;
   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8439 = new String[]{method4292(method4291("\u0004\u0016T}u")), method4292(method4291("\u0004\u0016Tvu")), method4292(method4291("\u0004\u0016Tru")), method4292(method4291("\u001bJT\u001b ")), method4292(method4291("\u0004\u0016T\t4\u000e\r\u000e\u000bu")), method4292(method4291("\u000e\u0011\u0016Y")), method4292(method4291("\u0004\u0016Tqu")), method4292(method4291("\u0004\u0016Twu")), method4292(method4291("\u0004\u0016Tsu")), method4292(method4291("\u0004\u0016Ttu")), method4292(method4291("\u0004\u0016Tpu"))};
   @OriginalMember(
      owner = "client!dr",
      name = "j",
      descriptor = "Let;"
   )
   public static class389 field8426 = new class389(4);
   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field8434 = new class113(60, 15);
   @OriginalMember(
      owner = "client!dr",
      name = "f",
      descriptor = "Lnaa;"
   )
   public static class113 field8435 = new class113(42, -1);
   @OriginalMember(
      owner = "client!dr",
      name = "o",
      descriptor = "[[I"
   )
   public static int[][] field8436 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
   @OriginalMember(
      owner = "client!dr",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field8437 = false;
   @OriginalMember(
      owner = "client!dr",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field8438 = new int[8];
   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "I"
   )
   public static int field8424;
   @OriginalMember(
      owner = "client!dr",
      name = "i",
      descriptor = "I"
   )
   public static int field8425;
   @OriginalMember(
      owner = "client!dr",
      name = "g",
      descriptor = "I"
   )
   public static int field8427;
   @OriginalMember(
      owner = "client!dr",
      name = "d",
      descriptor = "I"
   )
   public static int field8428;
   @OriginalMember(
      owner = "client!dr",
      name = "n",
      descriptor = "I"
   )
   public static int field8429;
   @OriginalMember(
      owner = "client!dr",
      name = "c",
      descriptor = "I"
   )
   public static int field8430;
   @OriginalMember(
      owner = "client!dr",
      name = "l",
      descriptor = "I"
   )
   public static int field8433;

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(I)I",
      line = 3
   )
   public final int method4283(int arg0) {
      try {
         ++field8428;
         if (arg0 != 6) {
            method4284(122, -125, 70, 113, true);
         }

         return this.field8432;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8439[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(IIIIZ)I",
      line = 20
   )
   public static final int method4284(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field8429;
         int var5 = arg2 & 15;
         int var6 = ~var5 <= -9 ? arg3 : arg0;
         if (arg4) {
            method4287((byte)84);
         }

         int var7 = ~var5 > -5 ? arg3 : (var5 != 12 && ~var5 != -15 ? arg1 : arg0);
         return (~(var5 & 2) == -1 ? var7 : -var7) + ((1 & var5) != 0 ? -var6 : var6);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8439[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(Lpfa;I)V",
      line = 42
   )
   public static final void method4285(class102 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(Lgk;B)V",
      line = 75
   )
   private final void method4286(class42 arg0, byte arg1) {
      try {
         ++field8430;
         if (arg1 != 46) {
            this.method4288(9, 31);
         }

         this.field8431 |= (long)(arg0.field554 << class42.field563 * this.field8432++);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8439[9] + (arg0 != null ? field8439[3] : field8439[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(B)Z",
      line = 87
   )
   public static final boolean method4287(byte arg0) {
      try {
         if (arg0 < 60) {
            field8434 = null;
         }

         ++field8424;

         try {
            if (~class326.field4957 == -3) {
               if (class361.field5602 == null) {
                  class361.field5602 = class405.method3257(class218.field3277, class583.field8598, class222.field3337);
                  if (class361.field5602 == null) {
                     return false;
                  }
               }

               if (class431.field6652 == null) {
                  class431.field6652 = new class507(class57.field708, class610.field8872);
               }

               class80 var1 = class259.field4270;
               if (class489.field7417 != null) {
                  var1 = class489.field7417;
               }

               if (var1.method762(class361.field5602, -1, 22050, class431.field6652, class542.field8171)) {
                  class259.field4270 = var1;
                  class259.field4270.method781(-17579);
                  if (~class516.field7852 < -1) {
                     class326.field4957 = 3;
                     class259.field4270.method766(~class516.field7852 < ~class61.field788 ? class61.field788 : class516.field7852, -1);

                     for(int var2 = 0; var2 < class44.field589.length; ++var2) {
                        class259.field4270.method777(71, var2, class44.field589[var2]);
                        class44.field589[var2] = 255;
                     }
                  } else {
                     class326.field4957 = 0;
                     class259.field4270.method766(class61.field788, -1);

                     for(int var3 = 0; var3 < class44.field589.length; ++var3) {
                        class259.field4270.method777(105, var3, class44.field589[var3]);
                        class44.field589[var3] = 255;
                     }
                  }

                  if (class489.field7417 == null) {
                     if (~class329.field4990 >= -1L) {
                        class259.field4270.method769(-11, class487.field7407, class361.field5602);
                     } else {
                        class259.field4270.method782(class361.field5602, class487.field7407, true, class329.field4990, 81);
                     }
                  }

                  if (class16.field214 != null) {
                     class16.field214.method5574((byte)34, class259.field4270);
                  }

                  class361.field5602 = null;
                  class431.field6652 = null;
                  class489.field7417 = null;
                  class218.field3277 = null;
                  class329.field4990 = 0L;
                  return true;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class259.field4270.method748(-67);
            class361.field5602 = null;
            class218.field3277 = null;
            class431.field6652 = null;
            class326.field4957 = 0;
            class489.field7417 = null;
         }

         return false;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8439[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(II)Lgk;",
      line = 188
   )
   public final class42 method4288(int arg0, int arg1) {
      try {
         if (arg1 != -26556) {
            this.method4290(-59, 35);
         }

         ++field8425;
         return class42.method305(this.method4290(arg0, -98), 77);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8439[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "(B)V",
      line = 199
   )
   public static void method4289(byte arg0) {
      try {
         field8426 = null;
         int var1 = -39 % ((-75 - arg0) / 36);
         field8436 = null;
         field8435 = null;
         field8434 = null;
         field8438 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8439[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "<init>",
      descriptor = "(Lgk;)V",
      line = 213
   )
   public class570(class42 arg0) {
      try {
         this.field8432 = 1;
         this.field8431 = (long)arg0.field554;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8439[4] + (arg0 != null ? field8439[3] : field8439[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "(II)I",
      line = 226
   )
   private final int method4290(int arg0, int arg1) {
      try {
         ++field8427;
         if (arg1 > -47) {
            method4284(33, -109, 11, -92, true);
         }

         return 15 & (int)(this.field8431 >> class42.field563 * arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8439[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "<init>",
      descriptor = "([Lgk;)V",
      line = 237
   )
   public class570(class42[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4291(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4292(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
