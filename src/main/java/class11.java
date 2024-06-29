import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class11 {
   @OriginalMember(
      owner = "client!lt",
      name = "n",
      descriptor = "I"
   )
   private int field134 = 65000;
   @OriginalMember(
      owner = "client!lt",
      name = "i",
      descriptor = "Lro;"
   )
   private class148 field141 = null;
   @OriginalMember(
      owner = "client!lt",
      name = "h",
      descriptor = "Lro;"
   )
   private class148 field137 = null;
   @OriginalMember(
      owner = "client!lt",
      name = "m",
      descriptor = "I"
   )
   private int field143;
   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field150 = new String[]{method91(method90("$:\u0014e\u0011")), method91(method90("$:\u0014j\u0011")), method91(method90("3`\u0014\fD")), method91(method90("$:\u0014d\u0011")), method91(method90("&;VN")), method91(method90("$:\u0014\u001eP&'N\u001c\u0011")), method91(method90("$:\u0014g\u0011")), method91(method90("$:\u0014VV\u001b:HKW/f")), method91(method90("\u000b/YJ\\r")), method91(method90("$:\u0014c\u0011")), method91(method90("$:\u0014a\u0011")), method91(method90("$:\u0014`\u0011")), method91(method90("$:\u0014f\u0011"))};
   @OriginalMember(
      owner = "client!lt",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field135 = true;
   @OriginalMember(
      owner = "client!lt",
      name = "k",
      descriptor = "Luk;"
   )
   public static class498 field146 = new class498(33, -2);
   @OriginalMember(
      owner = "client!lt",
      name = "r",
      descriptor = "I"
   )
   public static int field132;
   @OriginalMember(
      owner = "client!lt",
      name = "l",
      descriptor = "I"
   )
   public static int field136;
   @OriginalMember(
      owner = "client!lt",
      name = "e",
      descriptor = "I"
   )
   public static int field138;
   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "I"
   )
   public static int field139;
   @OriginalMember(
      owner = "client!lt",
      name = "j",
      descriptor = "I"
   )
   public static int field140;
   @OriginalMember(
      owner = "client!lt",
      name = "q",
      descriptor = "I"
   )
   public static int field142;
   @OriginalMember(
      owner = "client!lt",
      name = "o",
      descriptor = "I"
   )
   public static int field144;
   @OriginalMember(
      owner = "client!lt",
      name = "p",
      descriptor = "I"
   )
   public static int field145;
   @OriginalMember(
      owner = "client!lt",
      name = "c",
      descriptor = "I"
   )
   public static int field148;
   @OriginalMember(
      owner = "client!lt",
      name = "b",
      descriptor = "I"
   )
   public static int field149;
   @OriginalMember(
      owner = "client!lt",
      name = "g",
      descriptor = "Ljq;"
   )
   public static class672 field133;
   @OriginalMember(
      owner = "client!lt",
      name = "d",
      descriptor = "Lrr;"
   )
   public static class678 field147;

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(BI)[B",
      line = 5
   )
   public final byte[] method82(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field148;
         class148 var4 = this.field137;
         synchronized(this.field137) {
            try {
               if (this.field141.method1355(true) < (long)(arg1 * 6 + 6)) {
                  return null;
               } else {
                  if (arg0 > -43) {
                     field146 = null;
                  }

                  this.field141.method1359((long)(arg1 * 6), 125);
                  this.field141.method1353(class234.field3579, 0, 6, (byte)93);
                  int var6 = ((255 & class234.field3579[0]) << 16) - -((255 & class234.field3579[1]) << 8) - -(255 & class234.field3579[2]);
                  int var7 = (255 & class234.field3579[5]) + ((255 & class234.field3579[4]) << 8) + ((class234.field3579[3] & 255) << 16);
                  if (~var6 <= -1 && this.field134 >= var6) {
                     if (~var7 < -1 && ~(this.field137.method1355(true) / 520L) <= ~((long)var7)) {
                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        int var12 = 0;
                        if (var3) {
                           if (var7 == 0) {
                              return null;
                           }

                           this.field137.method1359((long)(var7 * 520), 124);
                        } else if (~var11 <= ~var6) {
                           if (!var3) {
                              return var10;
                           }
                        } else {
                           if (var7 == 0) {
                              return null;
                           }

                           this.field137.method1359((long)(var7 * 520), 124);
                        }

                        while(true) {
                           int var14 = -var11 + var6;
                           if (var14 > 512) {
                              var14 = 512;
                           }

                           this.field137.method1353(class234.field3579, 0, var14 + 8, (byte)98);
                           int var15 = (class234.field3579[0] << 8 & 65280) + (255 & class234.field3579[1]);
                           int var16 = ((255 & class234.field3579[2]) << 8) + (255 & class234.field3579[3]);
                           int var17 = (class234.field3579[6] & 255) + (((255 & class234.field3579[4]) << 16) - -(class234.field3579[5] << 8 & 65280));
                           int var18 = class234.field3579[7] & 255;
                           if (~arg1 != ~var15 || var12 != var16 || this.field143 != var18) {
                              return null;
                           }

                           if (var17 < 0 || ~((long)var17) < ~(this.field137.method1355(true) / 520L)) {
                              return null;
                           }

                           ++var12;
                           int var21 = 0;
                           if (var3) {
                              var10[var11++] = class234.field3579[var21 - -8];
                              ++var21;
                           }

                           while(true) {
                              while(var21 < var14) {
                                 var10[var11++] = class234.field3579[var21 - -8];
                                 ++var21;
                              }

                              if (!var3) {
                                 if (~var11 <= ~var6) {
                                    if (!var3) {
                                       return var10;
                                    }
                                 } else {
                                    if (var17 == 0) {
                                       return null;
                                    }

                                    this.field137.method1359((long)(var17 * 520), 124);
                                 }
                                 break;
                              }

                              ++var21;
                           }
                        }
                     } else {
                        return null;
                     }
                  } else {
                     return null;
                  }
               }
            } catch (IOException var41) {
               return null;
            }
         }
      } catch (RuntimeException var43) {
         throw class482.method3757(var43, field150[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IIZB[B)Z",
      line = 88
   )
   private final boolean method83(int param1, int param2, boolean param3, byte param4, byte[] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(ILro;Lro;I)V",
      line = 340
   )
   public class11(int arg0, class148 arg1, class148 arg2, int arg3) {
      try {
         this.field143 = arg0;
         this.field134 = arg3;
         this.field137 = arg1;
         this.field141 = arg2;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field150[5] + arg0 + ',' + (arg1 != null ? field150[2] : field150[4]) + ',' + (arg2 != null ? field150[2] : field150[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IIIZ)I",
      line = 215
   )
   public static final int method84(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         int var6 = arg2 & 3;
         ++field145;
         if (!arg3) {
            return -24;
         } else if (~var6 == -1) {
            return arg0;
         } else if (var6 == 1) {
            return arg1;
         } else {
            return ~var6 == -3 ? 7 - arg0 : -arg1 + 7;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field150[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "([BIBI)Z",
      line = 247
   )
   public final boolean method85(byte[] arg0, int arg1, byte arg2, int arg3) {
      try {
         if (arg2 >= -68) {
            return true;
         } else {
            ++field139;
            class148 var5 = this.field137;
            synchronized(this.field137) {
               if (arg1 >= 0 && arg1 <= this.field134) {
                  boolean var6 = this.method83(arg3, arg1, true, (byte)-29, arg0);
                  if (!var6) {
                     var6 = this.method83(arg3, arg1, false, (byte)-54, arg0);
                  }

                  return var6;
               } else {
                  throw new IllegalArgumentException();
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field150[3] + (arg0 != null ? field150[2] : field150[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(B)V",
      line = 284
   )
   public static void method86(byte arg0) {
      try {
         field146 = null;
         field133 = null;
         if (arg0 > -6) {
            method84(51, 108, 6, false);
         }

         field147 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field150[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(Z)Z",
      line = 299
   )
   public static final boolean method87(boolean arg0) {
      try {
         if (arg0) {
            field135 = false;
         }

         ++field136;
         return ~class342.field5204 <= -2;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field150[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 314
   )
   public final String toString() {
      try {
         ++field144;
         return field150[8] + this.field143;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field150[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(CI)Z",
      line = 322
   )
   public static final boolean method88(char arg0, int arg1) {
      try {
         if (arg1 != 0) {
            field146 = null;
         }

         ++field132;
         return ~arg0 <= -49 && ~arg0 >= -58 || arg0 >= 'A' && arg0 <= 'Z' || ~arg0 <= -98 && ~arg0 >= -123;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field150[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(I)Z",
      line = 353
   )
   public static final boolean method89(int arg0) {
      try {
         if (arg0 != -98) {
            field133 = null;
         }

         ++field142;
         return class261.field4293;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field150[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method90(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method91(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
