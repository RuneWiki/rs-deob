import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class97 {
   @OriginalMember(
      owner = "client!sc",
      name = "n",
      descriptor = "[Lbc;"
   )
   private class282[] field1357;
   @OriginalMember(
      owner = "client!sc",
      name = "g",
      descriptor = "Lje;"
   )
   public class196 field1360;
   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "[Lbc;"
   )
   public class282[] field1363;
   @OriginalMember(
      owner = "client!sc",
      name = "k",
      descriptor = "Lje;"
   )
   public class196 field1367;
   @OriginalMember(
      owner = "client!sc",
      name = "h",
      descriptor = "Lmu;"
   )
   private class258 field1371;
   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "Z"
   )
   public boolean field1361;
   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1372 = new String[]{method957(method956("\u000b$O\u0016k")), method957(method956("\u000b$O\u0010k")), method957(method956("\u000b$O\u0011k")), method957(method956("\u000b$O\u0015k")), method957(method956("\u0003iOz>")), method957(method956("\u00162\r8")), method957(method956("\u000b$Oh*\u0016.\u0015jk")), method957(method956("\u000b$O\u0017k"))};
   @OriginalMember(
      owner = "client!sc",
      name = "m",
      descriptor = "Llj;"
   )
   public static class304 field1358;
   @OriginalMember(
      owner = "client!sc",
      name = "i",
      descriptor = "I"
   )
   public static int field1368;
   @OriginalMember(
      owner = "client!sc",
      name = "l",
      descriptor = "[C"
   )
   public static char[] field1365;
   @OriginalMember(
      owner = "client!sc",
      name = "e",
      descriptor = "D"
   )
   public static double field1364;
   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "I"
   )
   public static int field1359;
   @OriginalMember(
      owner = "client!sc",
      name = "o",
      descriptor = "I"
   )
   public static int field1362;
   @OriginalMember(
      owner = "client!sc",
      name = "f",
      descriptor = "I"
   )
   public static int field1366;
   @OriginalMember(
      owner = "client!sc",
      name = "d",
      descriptor = "I"
   )
   public static int field1370;
   @OriginalMember(
      owner = "client!sc",
      name = "j",
      descriptor = "Lbja;"
   )
   public static class275 field1369;

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method951(byte arg0, int arg1) {
      try {
         ++field1366;
         class566 var2 = class146.method1321((long)arg1, 11, -1428737160);
         var2.method4268(4);
         if (arg0 > -112) {
            method954(20);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1372[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method952(byte arg0) {
      try {
         if (arg0 >= 40) {
            ++field1370;
            if (class218.field3290 != null) {
               class218.field3290.method5576(112);
            }

            if (class321.field4914 != null) {
               class321.field4914.method5576(123);
            }
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1372[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method953(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field1359;
         if (this.field1360 == null) {
            if (class731.field10905 == null) {
               byte[] var3 = class444.method3490(0.5F, 4.0F, 8, 16, 4.0F, arg0 ^ 99, new class534(419684), 16.0F, 0.6F, 128, 128);
               class731.field10905 = class408.method3272(false, var3, 0);
            }

            byte[] var4 = class100.method975(arg0 ^ 61, false, class731.field10905);
            byte[] var5 = new byte[var4.length * 4];
            int var6 = 0;
            int var7 = 0;
            if (var2 || ~var7 > -17) {
               do {
                  int var8 = var7 * 128 * 128;
                  int var9 = var8;
                  int var10 = 0;
                  if (var2 || ~var10 > -129) {
                     do {
                        int var11 = var10 * 128 + var9;
                        int var12 = (127 & var10 + -1) * 128 + var9;
                        int var13 = (var10 + 1 & 127) * 128 + var9;
                        int var14 = 0;
                        if (var2 || var14 < 128) {
                           do {
                              float var15 = (float)((var4[var12 + var14] & 255) - (255 & var4[var13 - -var14]));
                              float var16 = (float)((var4[(var14 + -1 & 127) + var11] & 255) - (255 & var4[(var14 - -1 & 127) + var11]));
                              float var17 = (float)(128.0D / Math.sqrt((double)(var15 * var15 + var16 * var16 + 16384.0F)));
                              var5[var6++] = (byte)((int)(var16 * var17 + 127.0F));
                              var5[var6++] = (byte)((int)(var17 * 128.0F + 127.0F));
                              var5[var6++] = (byte)((int)(var15 * var17 + 127.0F));
                              var5[var6++] = var4[var8++];
                              ++var14;
                           } while(var14 < 128);
                        }

                        ++var10;
                     } while(~var10 > -129);
                  }

                  ++var7;
               } while(~var7 > -17);
            }

            this.field1360 = this.field1371.method1486(16, var5, 128, class364.field5628, (byte)-128, 128);
         }

         if (arg0 != 99) {
            return true;
         } else {
            return this.field1360 != null;
         }
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field1372[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method954(int arg0) {
      try {
         field1369 = null;
         if (arg0 != 110) {
            field1364 = -1.9361034275650069D;
         }

         field1358 = null;
         field1365 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1372[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method955(byte arg0) {
      try {
         if (arg0 > -92) {
            return false;
         } else {
            ++field1362;
            if (this.field1361) {
               return this.field1367 != null;
            } else {
               return this.field1363 != null;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1372[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "<init>",
      descriptor = "(Lmu;)V"
   )
   public class97(class258 arg0) {
      boolean var2 = client.field1786;
      super();
      this.field1357 = null;
      this.field1360 = null;
      this.field1363 = null;
      this.field1367 = null;

      try {
         this.field1371 = arg0;
         this.field1361 = this.field1371.field4205;
         if (this.field1361 && !this.field1371.method1479(class681.field10155, class650.field9371, (byte)112)) {
            this.field1361 = false;
         }

         if (this.field1361 || this.field1371.method1453(class681.field10155, class650.field9371, (byte)-111)) {
            class730.method5384((byte)-96);
            if (this.field1361) {
               byte[] var7 = class100.method975(120, false, class374.field5836);
               this.field1367 = this.field1371.method1486(16, var7, 128, class681.field10155, (byte)-75, 128);
               byte[] var8 = class100.method975(116, false, class228.field3484);
               this.field1371.method1486(16, var8, 128, class681.field10155, (byte)109, 128);
            } else {
               int var10000;
               label56: {
                  this.field1363 = new class282[16];
                  int var3 = 0;
                  if (var2) {
                     var10000 = 32768;
                  } else if (~var3 <= -17) {
                     this.field1357 = new class282[16];
                     var10000 = 0;
                     if (!var2) {
                        break label56;
                     }
                  } else {
                     var10000 = 32768;
                  }

                  while(true) {
                     byte[] var4 = class257.method2168(var10000, var3 * 128 * 128 * 2, false, class374.field5836);
                     this.field1363[var3] = this.field1371.method2214(128, true, 128, class681.field10155, (byte)75, var4);
                     ++var3;
                     if (~var3 <= -17) {
                        this.field1357 = new class282[16];
                        var10000 = 0;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = 32768;
                     }
                  }
               }

               int var5 = var10000;
               if (var2 || ~var5 > -17) {
                  do {
                     byte[] var6 = class257.method2168(32768, var5 * 256 * 128, false, class228.field3484);
                     this.field1357[var5] = this.field1371.method2214(128, true, 128, class681.field10155, (byte)75, var6);
                     ++var5;
                  } while(~var5 > -17);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1372[6] + (arg0 != null ? field1372[4] : field1372[5]) + ')');
      }
   }

   static {
      new class642("", 73);
      field1358 = new class304(4);
      field1368 = 0;
      field1365 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method956(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method957(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
