import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class189 extends class537 {
   @OriginalMember(
      owner = "client!ei",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2369 = new String[]{method1474(method1473("o^\u0007\u007f\u001a")), method1474(method1473("o^\u0007|\u001a")), method1474(method1473("Ybk")), method1474(method1473("q\u0019\u0007\u0017O")), method1474(method1473("dBEU")), method1474(method1473("o^\u0007}\u001a")), method1474(method1473("o^\u0007~\u001a")), method1474(method1473("o^\u0007{\u001a")), method1474(method1473("o^\u0007x\u001a")), method1474(method1473("o^\u0007z\u001a"))};
   @OriginalMember(
      owner = "client!ei",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field2356 = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
   @OriginalMember(
      owner = "client!ei",
      name = "t",
      descriptor = "I"
   )
   public static int field2365 = 765;
   @OriginalMember(
      owner = "client!ei",
      name = "r",
      descriptor = "F"
   )
   private float field2353;
   @OriginalMember(
      owner = "client!ei",
      name = "F",
      descriptor = "F"
   )
   private float field2357;
   @OriginalMember(
      owner = "client!ei",
      name = "u",
      descriptor = "I"
   )
   public static int field2354;
   @OriginalMember(
      owner = "client!ei",
      name = "v",
      descriptor = "I"
   )
   private int field2355;
   @OriginalMember(
      owner = "client!ei",
      name = "H",
      descriptor = "I"
   )
   public static int field2358;
   @OriginalMember(
      owner = "client!ei",
      name = "E",
      descriptor = "I"
   )
   public static int field2360;
   @OriginalMember(
      owner = "client!ei",
      name = "w",
      descriptor = "I"
   )
   public static int field2361;
   @OriginalMember(
      owner = "client!ei",
      name = "D",
      descriptor = "I"
   )
   private int field2363;
   @OriginalMember(
      owner = "client!ei",
      name = "A",
      descriptor = "I"
   )
   public static int field2364;
   @OriginalMember(
      owner = "client!ei",
      name = "C",
      descriptor = "I"
   )
   public static int field2366;
   @OriginalMember(
      owner = "client!ei",
      name = "x",
      descriptor = "Ldaa;"
   )
   public static class12 field2352;
   @OriginalMember(
      owner = "client!ei",
      name = "s",
      descriptor = "Lti;"
   )
   public static class464 field2359;
   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private String field2362;
   @OriginalMember(
      owner = "client!ei",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   private String field2367;
   @OriginalMember(
      owner = "client!ei",
      name = "G",
      descriptor = "Ljava/lang/String;"
   )
   private String field2368;

   @OriginalMember(
      owner = "client!ei",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class189(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1466(boolean arg0) {
      try {
         field2352 = null;
         field2359 = null;
         if (!arg0) {
            method1466(true);
         }

         field2356 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2369[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1467(int arg0) {
      try {
         ++field2364;
         if (arg0 != -25083) {
            this.field2355 = -113;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2369[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1468(OggPacket arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.field2357 = 1.5869554F;
         }

         ++field2354;
         if (~super.field7848 >= -1 || field2369[2].equals(this.field2367)) {
            class128 var3 = new class128(arg0.getData());
            int var4 = var3.method1104(255);
            if (super.field7848 <= 8) {
               if (~(128 | var4) == -1) {
                  throw new IllegalStateException();
               }

               if (super.field7848 == 0) {
                  var3.field1590 += 23;
                  this.field2363 = var3.method1067(false);
                  this.field2355 = var3.method1067(false);
                  if (~this.field2363 != -1 && this.field2355 != 0) {
                     class128 var5 = new class128(16);
                     var3.method1102(16, var5.field1552, 0, (byte)87);
                     this.field2362 = var5.method1083((byte)124);
                     var5.field1590 = 0;
                     var3.method1102(16, var5.field1552, 0, (byte)-116);
                     this.field2367 = var5.method1083((byte)63);
                     return;
                  }

                  throw new IllegalStateException();
               }
            } else {
               if (~var4 == -1) {
                  long var6 = var3.method1091(-1013057045);
                  long var8 = var3.method1091(-1013057045);
                  long var10 = var3.method1091(-1013057045);
                  if (var6 < 0L || var8 < 0L || ~var10 > -1L || ~var10 < ~var6) {
                     throw new IllegalStateException();
                  }

                  this.field2357 = (float)((var6 + var8) * (long)this.field2355) / (float)this.field2363;
                  this.field2353 = (float)((long)this.field2355 * var6) / (float)this.field2363;
                  int var12 = var3.method1067(false);
                  if (var12 < 0 || var3.field1552.length + -var3.field1590 < var12) {
                     throw new IllegalStateException();
                  }

                  this.field2368 = class748.method5456((byte)-82, var12, var3.field1552, var3.field1590);
               }

               if (~(var4 | 128) != -1) {
                  return;
               }
            }

         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field2369[1] + (arg0 != null ? field2369[3] : field2369[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method1469(byte arg0) {
      try {
         if (arg0 != -39) {
            return null;
         } else {
            ++field2366;
            return this.field2368;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2369[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "g",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method1470(int arg0) {
      try {
         if (arg0 != 36064) {
            field2359 = null;
         }

         ++field2358;
         return this.field2362;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2369[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "f",
      descriptor = "(I)F"
   )
   public final float method1471(int arg0) {
      try {
         ++field2360;
         int var2 = 114 % ((arg0 - -27) / 37);
         return this.field2357;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2369[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "e",
      descriptor = "(I)F"
   )
   public final float method1472(int arg0) {
      try {
         ++field2361;
         if (arg0 != 0) {
            this.field2357 = -0.87970644F;
         }

         return this.field2353;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2369[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1473(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1474(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
