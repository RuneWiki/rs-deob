import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class106 {
   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "I"
   )
   public int field1339 = 16777215;
   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "I"
   )
   public int field1344 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "o",
      descriptor = "I"
   )
   public int field1340 = 70;
   @OriginalMember(
      owner = "client!iv",
      name = "t",
      descriptor = "I"
   )
   private int field1348 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "j",
      descriptor = "I"
   )
   private int field1337 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "s",
      descriptor = "I"
   )
   public int field1352 = 0;
   @OriginalMember(
      owner = "client!iv",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   private String field1354 = "";
   @OriginalMember(
      owner = "client!iv",
      name = "B",
      descriptor = "I"
   )
   private int field1351 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "g",
      descriptor = "I"
   )
   public int field1355 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "I"
   )
   public int field1342 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "n",
      descriptor = "I"
   )
   public int field1363 = 0;
   @OriginalMember(
      owner = "client!iv",
      name = "q",
      descriptor = "I"
   )
   private int field1364 = -1;
   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "I"
   )
   public int field1349 = 0;
   @OriginalMember(
      owner = "client!iv",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1365 = new String[]{method952(method951("B8\u001aQ\u0003")), method952(method951("P`\u001a4V")), method952(method951("E;Xv")), method952(method951("B8\u001aP\u0003")), method952(method951("\u000e|\u0002")), method952(method951("\u000b2\u0014")), method952(method951("\r8\u0005'")), method952(method951("\u000e|\u0007")), method952(method951("H\"]\u007fE_+FhDY`Ci\u0014Hs")), method952(method951("\r+\t")), method952(method951("\r;\t")), method952(method951("\r8\u0006'")), method952(method951("\u000e}U")), method952(method951("\u000ez\u0004")), method952(method951("B8\u001a[\u0003")), method952(method951("B8\u001a\\\u0003")), method952(method951("B8\u001aR\u0003")), method952(method951("\u000e\u007f")), method952(method951("B8\u001a_\u0003")), method952(method951("B8\u001a^\u0003")), method952(method951("B8\u001aY\u0003")), method952(method951("B8\u001a]\u0003")), method952(method951("B8\u001aV\u0003")), method952(method951("B8\u001aS\u0003"))};
   @OriginalMember(
      owner = "client!iv",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field1336 = false;
   @OriginalMember(
      owner = "client!iv",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field1359 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @OriginalMember(
      owner = "client!iv",
      name = "r",
      descriptor = "Lkda;"
   )
   public static class411 field1361 = new class411();
   @OriginalMember(
      owner = "client!iv",
      name = "x",
      descriptor = "I"
   )
   public static int field1338;
   @OriginalMember(
      owner = "client!iv",
      name = "h",
      descriptor = "I"
   )
   public static int field1341;
   @OriginalMember(
      owner = "client!iv",
      name = "i",
      descriptor = "I"
   )
   public static int field1343;
   @OriginalMember(
      owner = "client!iv",
      name = "C",
      descriptor = "I"
   )
   public static int field1345;
   @OriginalMember(
      owner = "client!iv",
      name = "p",
      descriptor = "I"
   )
   public static int field1346;
   @OriginalMember(
      owner = "client!iv",
      name = "m",
      descriptor = "I"
   )
   public static int field1347;
   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "I"
   )
   public static int field1350;
   @OriginalMember(
      owner = "client!iv",
      name = "w",
      descriptor = "I"
   )
   public static int field1356;
   @OriginalMember(
      owner = "client!iv",
      name = "A",
      descriptor = "I"
   )
   public static int field1357;
   @OriginalMember(
      owner = "client!iv",
      name = "e",
      descriptor = "I"
   )
   public static int field1360;
   @OriginalMember(
      owner = "client!iv",
      name = "u",
      descriptor = "I"
   )
   public static int field1362;
   @OriginalMember(
      owner = "client!iv",
      name = "v",
      descriptor = "Lm;"
   )
   public class203 field1353;
   @OriginalMember(
      owner = "client!iv",
      name = "k",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1358;

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public static final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4273;

      try {
         label47: {
            if (~arg6 == ~arg8 && arg3 == arg4 && arg0 == arg5 && ~arg2 == ~arg9) {
               class44.method373(arg7, arg2, arg5, (byte)-103, arg6, arg3);
               if (!var10) {
                  break label47;
               }
            }

            int var11 = arg6;
            int var12 = arg3;
            int var13 = arg6 * 3;
            int var14 = arg3 * 3;
            int var15 = arg8 * 3;
            int var16 = arg4 * 3;
            int var17 = arg0 * 3;
            int var18 = arg9 * 3;
            int var19 = -arg6 + arg5 + -var17 + var15;
            int var20 = -var18 + arg2 - -var16 + -arg3;
            int var21 = -var15 + var17 - var15 + var13;
            int var22 = -var16 + var14 + var18 - var16;
            int var23 = -var13 + var15;
            int var24 = -var14 + var16;
            int var25 = 128;
            if (var10 || ~var25 >= -4097) {
               do {
                  int var26 = var25 * var25 >> 12;
                  int var27 = var25 * var26 >> 12;
                  int var28 = var19 * var27;
                  int var29 = var20 * var27;
                  int var30 = var21 * var26;
                  int var31 = var22 * var26;
                  int var32 = var23 * var25;
                  int var33 = var24 * var25;
                  int var34 = (var30 - -var32 + var28 >> 12) + arg6;
                  int var35 = (var29 + var31 - -var33 >> 12) + arg3;
                  class44.method373(arg7, var35, var34, (byte)-103, var11, var12);
                  var11 = var34;
                  var12 = var35;
                  var25 += 128;
               } while(~var25 >= -4097);
            }
         }

         ++field1360;
         if (arg1 <= 65) {
            method941(56);
         }
      } catch (RuntimeException var37) {
         throw class534.method3846(var37, field1365[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V"
   )
   public static final void method940(String arg0, Throwable arg1, byte arg2) {
      ++field1343;

      try {
         String var3 = "";
         if (arg1 != null) {
            var3 = class745.method5386(-71, arg1);
         }

         if (arg0 != null) {
            if (arg1 != null) {
               var3 = var3 + field1365[5];
            }

            var3 = var3 + arg0;
         }

         class310.method2325(var3, -21996);
         String var4 = class250.method1882(field1365[12], -34, ":", var3);
         String var5 = class250.method1882(field1365[13], -34, "@", var4);
         if (arg2 != -33) {
            method940((String)null, (Throwable)null, (byte)-77);
         }

         String var6 = class250.method1882(field1365[4], arg2 ^ -115, "&", var5);
         String var7 = class250.method1882(field1365[7], -77, "#", var6);
         if (class439.field6098 != null) {
            class289 var8 = class648.field9092.method1941(new URL(class439.field6098.getCodeBase(), field1365[8] + class477.field6594 + field1365[10] + (class755.field10960 == null ? String.valueOf(class121.field1516) : class755.field10960) + field1365[6] + class255.field3263 + field1365[11] + class255.field3258 + field1365[9] + var7), false);

            while(var8.field3826 == 0) {
               class173.method1347(-80, 1L);
            }

            if (~var8.field3826 == -2) {
               DataInputStream var9 = (DataInputStream)var8.field3830;
               var9.read();
               var9.close();
            }
         }
      } catch (Exception var10) {
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method941(int arg0) {
      try {
         field1358 = null;
         field1361 = null;
         int var1 = 118 / ((arg0 - -30) / 43);
         field1359 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1365[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method942(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label116: {
            if (arg1 != 1) {
               if (~arg1 == -3) {
                  this.field1339 = arg0.method4293(119);
                  if (!var4) {
                     break label116;
                  }
               }

               if (arg1 == 3) {
                  this.field1364 = arg0.method4280(arg2 ^ 14479);
                  if (!var4) {
                     break label116;
                  }
               }

               if (arg1 == 4) {
                  this.field1337 = arg0.method4280(-19104);
                  if (!var4) {
                     break label116;
                  }
               }

               if (~arg1 == -6) {
                  this.field1351 = arg0.method4280(-19104);
                  if (!var4) {
                     break label116;
                  }
               }

               if (arg1 != 6) {
                  if (~arg1 == -8) {
                     this.field1349 = arg0.method4333(-65);
                     if (!var4) {
                        break label116;
                     }
                  }

                  if (~arg1 != -9) {
                     if (~arg1 == -10) {
                        this.field1340 = arg0.method4280(-19104);
                        if (!var4) {
                           break label116;
                        }
                     }

                     if (~arg1 == -11) {
                        this.field1363 = arg0.method4333(-59);
                        if (!var4) {
                           break label116;
                        }
                     }

                     if (arg1 != 11) {
                        if (arg1 == 12) {
                           this.field1344 = arg0.method4288((byte)83);
                           if (!var4) {
                              break label116;
                           }
                        }

                        if (arg1 == 13) {
                           this.field1352 = arg0.method4333(arg2 ^ 29290);
                           if (!var4) {
                              break label116;
                           }
                        }

                        if (arg1 != 14) {
                           break label116;
                        }

                        this.field1355 = arg0.method4280(-19104);
                        if (!var4) {
                           break label116;
                        }
                     }

                     this.field1355 = 0;
                     if (!var4) {
                        break label116;
                     }
                  }

                  this.field1354 = arg0.method4325(false);
                  if (!var4) {
                     break label116;
                  }
               }

               this.field1348 = arg0.method4280(-19104);
               if (!var4) {
                  break label116;
               }
            }

            this.field1342 = arg0.method4280(arg2 + 10097);
         }

         ++field1356;
         if (arg2 != -29201) {
            this.method949(108, 85);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1365[14] + (arg0 != null ? field1365[1] : field1365[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;"
   )
   public static final Class method943(String arg0, byte arg1) throws ClassNotFoundException {
      try {
         ++field1357;
         if (arg1 <= 8) {
            return null;
         } else if (arg0.equals("B")) {
            return Byte.TYPE;
         } else if (arg0.equals("I")) {
            return Integer.TYPE;
         } else if (arg0.equals("S")) {
            return Short.TYPE;
         } else if (arg0.equals("J")) {
            return Long.TYPE;
         } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
         } else if (arg0.equals("F")) {
            return Float.TYPE;
         } else if (arg0.equals("D")) {
            return Double.TYPE;
         } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1365[20] + (arg0 != null ? field1365[1] : field1365[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method944(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         int var4 = 83 / ((arg0 - -49) / 34);
         ++field1346;

         do {
            int var5 = arg1.method4288((byte)117);
            if (~var5 == -1) {
               break;
            }

            this.method942(arg1, var5, -29201);
         } while(!var3);

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1365[21] + arg0 + ',' + (arg1 != null ? field1365[1] : field1365[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(Lha;I)Lbo;"
   )
   public final class763 method945(class65 arg0, int arg1) {
      try {
         if (arg1 != -11) {
            this.field1351 = -125;
         }

         ++field1347;
         if (this.field1337 < 0) {
            return null;
         } else {
            class763 var3 = (class763)this.field1353.field2491.method4239((long)this.field1337, arg1 + 11);
            if (var3 == null) {
               this.method947(arg0, arg1 ^ 19457);
               var3 = (class763)this.field1353.field2491.method4239((long)this.field1337, 0);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1365[22] + (arg0 != null ? field1365[1] : field1365[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lha;I)Lbo;"
   )
   public final class763 method946(class65 arg0, int arg1) {
      try {
         ++field1345;
         if (this.field1351 < 0) {
            return null;
         } else {
            class763 var3 = (class763)this.field1353.field2491.method4239((long)this.field1351, arg1);
            if (var3 == null) {
               this.method947(arg0, arg1 ^ -19468);
               var3 = (class763)this.field1353.field2491.method4239((long)this.field1351, 0);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1365[3] + (arg0 != null ? field1365[1] : field1365[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "(Lha;I)V"
   )
   private final void method947(class65 arg0, int arg1) {
      try {
         if (arg1 == -19468) {
            ++field1341;
            class74 var3 = this.field1353.field2488;
            if (this.field1364 >= 0 && this.field1353.field2491.method4239((long)this.field1364, 0) == null && var3.method717(this.field1364, (byte)-58)) {
               class267 var4 = class267.method2048(var3, this.field1364);
               this.field1353.field2491.method4238(arg1 + 19579, arg0.method549(var4, true), (long)this.field1364);
            }

            if (this.field1351 >= 0 && this.field1353.field2491.method4239((long)this.field1351, 0) == null && var3.method717(this.field1351, (byte)-58)) {
               class267 var5 = class267.method2048(var3, this.field1351);
               this.field1353.field2491.method4238(96, arg0.method549(var5, true), (long)this.field1351);
            }

            if (this.field1337 >= 0 && this.field1353.field2491.method4239((long)this.field1337, arg1 + 19468) == null && var3.method717(this.field1337, (byte)-58)) {
               class267 var6 = class267.method2048(var3, this.field1337);
               this.field1353.field2491.method4238(23, arg0.method549(var6, true), (long)this.field1337);
            }

            if (this.field1348 >= 0 && this.field1353.field2491.method4239((long)this.field1348, 0) == null && var3.method717(this.field1348, (byte)-58)) {
               class267 var7 = class267.method2048(var3, this.field1348);
               this.field1353.field2491.method4238(arg1 + 19571, arg0.method549(var7, true), (long)this.field1348);
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1365[23] + (arg0 != null ? field1365[1] : field1365[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(ILha;)Lbo;"
   )
   public final class763 method948(int arg0, class65 arg1) {
      try {
         ++field1350;
         if (arg0 < ~this.field1348) {
            return null;
         } else {
            class763 var3 = (class763)this.field1353.field2491.method4239((long)this.field1348, 0);
            if (var3 == null) {
               this.method947(arg1, -19468);
               var3 = (class763)this.field1353.field2491.method4239((long)this.field1348, 0);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1365[15] + arg0 + ',' + (arg1 != null ? field1365[1] : field1365[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public final String method949(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 11) {
            this.field1354 = null;
         }

         ++field1338;
         String var4 = this.field1354;

         String var10000;
         while(true) {
            int var5 = var4.indexOf(field1365[17]);
            if (var5 >= 0) {
               var10000 = var4.substring(0, var5) + class734.method5323(arg0, (byte)71, false) + var4.substring(var5 - -2);
               if (var3) {
                  break;
               }

               var4 = var10000;
               if (!var3) {
                  continue;
               }
            }

            var10000 = var4;
            break;
         }

         return var10000;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1365[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "(Lha;I)Lbo;"
   )
   public final class763 method950(class65 arg0, int arg1) {
      try {
         ++field1362;
         if (arg1 > this.field1364) {
            return null;
         } else {
            class763 var3 = (class763)this.field1353.field2491.method4239((long)this.field1364, arg1);
            if (var3 == null) {
               this.method947(arg0, -19468);
               var3 = (class763)this.field1353.field2491.method4239((long)this.field1364, arg1);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1365[18] + (arg0 != null ? field1365[1] : field1365[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method951(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method952(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
