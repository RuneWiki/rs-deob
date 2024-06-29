import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class614 extends class657 {
   @OriginalMember(
      owner = "client!sda",
      name = "x",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field8727;
   @OriginalMember(
      owner = "client!sda",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8734 = new String[]{method4518(method4517("_K\u001bo1\u0004")), method4518(method4517("BZ\u0016-")), method4518(method4517("W\u0001To\r")), method4518(method4517("_K\u001bo4\u0004")), method4518(method4517("_K\u001boLEA\u00135N\u0004")), method4518(method4517("_K\u001bo6\u0004")), method4518(method4517("_K\u001bo5\u0004")), method4518(method4517("_K\u001bo3\u0004")), method4518(method4517("_K\u001bo2\u0004"))};
   @OriginalMember(
      owner = "client!sda",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field8729 = new int[256];
   @OriginalMember(
      owner = "client!sda",
      name = "w",
      descriptor = "I"
   )
   public static int field8731;
   @OriginalMember(
      owner = "client!sda",
      name = "y",
      descriptor = "Lsb;"
   )
   public static class261 field8732;
   @OriginalMember(
      owner = "client!sda",
      name = "D",
      descriptor = "I"
   )
   public static int field8724;
   @OriginalMember(
      owner = "client!sda",
      name = "B",
      descriptor = "I"
   )
   public static int field8725;
   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "I"
   )
   public static int field8726;
   @OriginalMember(
      owner = "client!sda",
      name = "E",
      descriptor = "I"
   )
   public static int field8728;
   @OriginalMember(
      owner = "client!sda",
      name = "C",
      descriptor = "I"
   )
   public static int field8730;
   @OriginalMember(
      owner = "client!sda",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field8733;

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "([BI)V"
   )
   public static final void method4513(byte[] arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field8724;
         if (arg1 == 18394) {
            class65 var3 = new class65(arg0);

            while(true) {
               int var4;
               label82:
               do {
                  while(true) {
                     do {
                        var4 = var3.method665(false);
                        if (~var4 == -1) {
                           return;
                        }

                        if (~var4 != -2) {
                           break;
                        }

                        int[] var5 = class720.field10319 = new int[6];
                        var5[0] = var3.method685(-2);
                        var5[1] = var3.method685(arg1 + -18396);
                        var5[2] = var3.method685(-2);
                        var5[3] = var3.method685(class607.method4473(arg1, -18396));
                        var5[4] = var3.method685(-2);
                        var5[5] = var3.method685(arg1 + -18396);
                     } while(!var2);

                     if (var4 != 4) {
                        break;
                     }

                     int var6 = var3.method665(false);
                     class588.field8262 = new int[var6];
                     int var7 = 0;
                     if (var2) {
                        class588.field8262[var7] = var3.method685(-2);
                        if (~class588.field8262[var7] == -65536) {
                           class588.field8262[var7] = -1;
                        }

                        ++var7;
                     }

                     while(true) {
                        if (~var6 >= ~var7) {
                           if (!var2) {
                              if (var2) {
                                 continue label82;
                              }
                              break;
                           }
                        } else {
                           class588.field8262[var7] = var3.method685(-2);
                        }

                        if (~class588.field8262[var7] == -65536) {
                           class588.field8262[var7] = -1;
                        }

                        ++var7;
                     }
                  }
               } while(var4 != 5);

               int var8 = var3.method665(false);
               class454.field6598 = new int[var8];
               int var9 = 0;
               if (var2) {
                  class454.field6598[var9] = var3.method685(arg1 + -18396);
                  if (class454.field6598[var9] == 65535) {
                     class454.field6598[var9] = -1;
                  }

                  ++var9;
               }

               while(true) {
                  if (var8 <= var9) {
                     if (!var2) {
                        break;
                     }
                  } else {
                     class454.field6598[var9] = var3.method685(arg1 + -18396);
                  }

                  if (class454.field6598[var9] == 65535) {
                     class454.field6598[var9] = -1;
                  }

                  ++var9;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field8734[7] + (arg0 != null ? field8734[2] : field8734[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(Ljava/lang/Object;ZZ)[B"
   )
   public static final byte[] method4514(Object arg0, boolean arg1, boolean arg2) {
      try {
         ++field8726;
         if (arg1) {
            return null;
         } else if (arg0 == null) {
            return null;
         } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[])arg0;
            return !arg2 ? var3 : class37.method420(var3, 34);
         } else if (arg0 instanceof class86) {
            class86 var4 = (class86)arg0;
            return var4.method899(-77);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8734[3] + (arg0 != null ? field8734[2] : field8734[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "<init>",
      descriptor = "(Lhh;Ljava/lang/Object;I)V"
   )
   public class614(class250 arg0, Object arg1, int arg2) {
      super(arg0, arg2);

      try {
         this.field8727 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8734[4] + (arg0 != null ? field8734[2] : field8734[1]) + ',' + (arg1 != null ? field8734[2] : field8734[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method4515(int arg0, int arg1, int arg2) {
      try {
         arg1 = (127 & arg2) * arg1 >> 7;
         ++field8725;
         if (arg1 < 2) {
            arg1 = 2;
            if (!client.field10022) {
               return arg0 < 88 ? 69 : (arg2 & 65408) + arg1;
            }
         }

         if (~arg1 < -127) {
            arg1 = 126;
         }

         return arg0 < 88 ? 69 : (arg2 & 65408) + arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8734[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4516(byte arg0) {
      try {
         if (arg0 <= 2) {
            field8731 = -88;
         }

         field8732 = null;
         field8729 = null;
         field8733 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8734[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method3608(int arg0) {
      try {
         ++field8730;
         if (arg0 != 14336) {
            field8733 = null;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8734[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "e",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method3607(int arg0) {
      try {
         ++field8728;
         if (arg0 != 12) {
            field8732 = null;
         }

         return this.field8727;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8734[8] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = var0;

         for(int var2 = 0; ~var2 > -9; ++var2) {
            if (~(var1 & 1) != -2) {
               var1 >>>= 1;
            } else {
               var1 = -306674912 ^ var1 >>> 1;
            }
         }

         field8729[var0] = var1;
      }

      field8731 = -1;
      field8732 = new class261();
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4517(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4518(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
