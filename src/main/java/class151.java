import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class151 {
   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2276 = new String[]{method1384(method1383("\u0001\u000b3Z\u0006")), method1384(method1383("\u001bJ36S")), method1384(method1383("\u0014Pq\u0018")), method1384(method1383("\u001bJ37S")), method1384(method1383("\u001bJ31S")), method1384(method1383("\u001bJ35S")), method1384(method1383("\u001bJ30S")), method1384(method1383("?j["))};
   @OriginalMember(
      owner = "client!ao",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2271 = new int[32];
   @OriginalMember(
      owner = "client!ao",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field2270 = false;
   @OriginalMember(
      owner = "client!ao",
      name = "f",
      descriptor = "I"
   )
   public static int field2272;
   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "I"
   )
   public static int field2273;
   @OriginalMember(
      owner = "client!ao",
      name = "b",
      descriptor = "I"
   )
   public static int field2274;
   @OriginalMember(
      owner = "client!ao",
      name = "d",
      descriptor = "I"
   )
   public static int field2275;

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1378(int arg0, int arg1, int arg2) {
      try {
         ++field2272;
         if (arg1 > -15) {
            method1382(70, -120);
         }

         return class378.method3088((byte)-100, arg0, arg2) | ~(458752 & arg0) != -1 || class8.method34(arg2, 0, arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2276[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1379(int arg0) {
      try {
         field2271 = null;
         if (arg0 <= 2) {
            method1382(-109, -92);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2276[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(BILds;I)V"
   )
   public static final void method1380(byte arg0, int arg1, class525 arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field2274;
         if (class304.field4759) {
            int var5 = 0;
            class185 var6 = (class185)arg2.field8005.method3688(true);
            int var7;
            if (var4) {
               var7 = class65.method505(var6, -50);
               if (~var7 < ~var5) {
                  var5 = var7;
               }

               var6 = (class185)arg2.field8005.method3691(20);
            }

            while(true) {
               while(var6 != null) {
                  var7 = class65.method505(var6, -50);
                  if (~var7 < ~var5) {
                     var5 = var7;
                  }

                  var6 = (class185)arg2.field8005.method3691(20);
               }

               var5 += 8;
               var7 = arg2.field8004 * 16 + 21;
               int var10000 = arg2.field8004 * 16;
               byte var10001 = class485.field7378;
               if (!var4) {
                  class430.field6640 = var10000 - -(var10001 != 0 ? 26 : 22);
                  int var8 = class344.field5235 + class108.field1490;
                  if (~class316.field4878 > ~(var5 + var8)) {
                     var8 = class108.field1490 - var5;
                  }

                  if (arg0 <= 42) {
                     field2270 = false;
                  }

                  if (var8 < 0) {
                     var8 = 0;
                  }

                  int var9 = class485.field7378 ? 33 : 31;
                  int var10 = arg3 - var9 - -13;
                  if (var10 - -var7 > class692.field10301) {
                     var10 = -var7 + class692.field10301;
                  }

                  if (var10 < 0) {
                     var10 = 0;
                  }

                  class532.field8084 = var8;
                  class255.field3853 = var10;
                  class785.field11521 = var5;
                  class525.field7997 = arg2;
                  return;
               }

               if (var10000 < var10001) {
                  var5 = var7;
               }

               var6 = (class185)arg2.field8005.method3691(20);
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field2276[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2276[0] : field2276[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1381(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field2273;
         class441 var2 = null;

         try {
            if (arg0 > -71) {
               field2270 = true;
            }

            class275 var3 = class498.field7578.method2433("2", true, (byte)77);
            if (var1) {
               class697.method5128(1L, 119);
            }

            while(~var3.field4398 == -1) {
               class697.method5128(1L, 119);
            }

            if (var3.field4398 == 1) {
               var2 = (class441)var3.field4401;
               byte[] var4 = new byte[(int)var2.method3476((byte)-91)];
               int var5 = 0;
               int var6;
               if (var1) {
                  var6 = var2.method3473(var4, var4.length + -var5, var5, (byte)-69);
                  if (~var6 == 0) {
                     throw new IOException(field2276[7]);
                  }

                  var5 += var6;
               }

               while(true) {
                  int var10000;
                  if (~var5 <= ~var4.length) {
                     var10000 = -1;
                     if (!var1) {
                        class532.method4093(-1, new class354(var4));
                        break;
                     }
                  } else {
                     var10000 = var2.method3473(var4, var4.length + -var5, var5, (byte)-69);
                  }

                  var6 = var10000;
                  if (~var6 == 0) {
                     throw new IOException(field2276[7]);
                  }

                  var5 += var6;
               }
            }
         } catch (Exception var9) {
         }

         try {
            if (var2 != null) {
               var2.method3477((byte)124);
            }
         } catch (Exception var8) {
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2276[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1382(int arg0, int arg1) {
      try {
         ++field2275;
         if (arg1 != 16) {
            method1381((byte)19);
         }

         class566 var2 = class146.method1321((long)arg0, 8, arg1 ^ -1428737176);
         var2.method4268(4);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2276[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1383(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1384(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
