import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class417 extends class557 {
   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6113 = new String[]{method3263(method3262("\u0018TeJ\tV")), method3263(method3262("\u0018TeJ\u000bV")), method3263(method3262("\u0010Ch\b")), method3263(method3262("\u0018TeJ\u0006V")), method3263(method3262("\u0005\u0018*J>")), method3263(method3262("7Xr\u0005/\u0017R$\u0016\"\u001a_|^")), method3263(method3262("\u0018TeJ\u0002V")), method3263(method3262("\u0018TeJ\u0004V")), method3263(method3262("\u0018TeJ\u0001V")), method3263(method3262("\u0018TeJ\u0007V")), method3263(method3262("\u0018TeJ\u0000V")), method3263(method3262("\u0018TeJ\u0005V"))};
   @OriginalMember(
      owner = "client!fba",
      name = "o",
      descriptor = "[Z"
   )
   public static boolean[] field6107 = new boolean[100];
   @OriginalMember(
      owner = "client!fba",
      name = "i",
      descriptor = "D"
   )
   public static double field6106;
   @OriginalMember(
      owner = "client!fba",
      name = "h",
      descriptor = "F"
   )
   public static float field6110;
   @OriginalMember(
      owner = "client!fba",
      name = "p",
      descriptor = "I"
   )
   public static int field6102;
   @OriginalMember(
      owner = "client!fba",
      name = "l",
      descriptor = "I"
   )
   public static int field6103;
   @OriginalMember(
      owner = "client!fba",
      name = "r",
      descriptor = "I"
   )
   public static int field6104;
   @OriginalMember(
      owner = "client!fba",
      name = "k",
      descriptor = "I"
   )
   public static int field6105;
   @OriginalMember(
      owner = "client!fba",
      name = "j",
      descriptor = "I"
   )
   public static int field6108;
   @OriginalMember(
      owner = "client!fba",
      name = "n",
      descriptor = "I"
   )
   public static int field6109;
   @OriginalMember(
      owner = "client!fba",
      name = "m",
      descriptor = "I"
   )
   public static int field6111;
   @OriginalMember(
      owner = "client!fba",
      name = "q",
      descriptor = "I"
   )
   public static int field6112;

   @OriginalMember(
      owner = "client!fba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field6103;
         if (arg0 != 0) {
            field6107 = null;
         }

         return 2;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6113[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(IILsba;II)V"
   )
   public static final void method3257(int param0, int param1, class311 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fba",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3258(int arg0) {
      try {
         field6107 = null;
         if (arg0 != 122) {
            field6106 = -0.8427043719653075D;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6113[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         ++field6102;
         if (!arg1) {
            method3260((class65)null, 22);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6113[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(ILjava/lang/String;IZ)Z"
   )
   public static final boolean method3259(int arg0, String arg1, int arg2, boolean arg3) {
      boolean var4 = client.field10022;

      try {
         ++field6108;
         if (arg2 >= 2 && arg2 <= 36) {
            boolean var5 = false;
            byte var6 = 0;
            int var7 = arg0;
            int var8 = arg1.length();
            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg1.charAt(var9);
            } else if (var9 >= var8) {
               var10000 = (char)var6;
               if (!var4) {
                  return (boolean)var6;
               }
            } else {
               var10000 = arg1.charAt(var9);
            }

            while(true) {
               label144: {
                  int var10 = var10000;
                  if (~var9 == -1) {
                     if (var10 == 45) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label144;
                        }
                     }

                     if (~var10 == -44 && arg3 && !var4) {
                        ++var9;
                        break label144;
                     }
                  }

                  label131: {
                     if (~var10 <= -49 && ~var10 >= -58) {
                        var10 -= 48;
                        if (!var4) {
                           break label131;
                        }
                     }

                     if (var10 >= 65) {
                        if (~var10 >= -91) {
                           var10 -= 55;
                           if (var4) {
                              if (~var10 > -98 || var10 > 122) {
                                 break;
                              }

                              var10 -= 87;
                              if (var4) {
                                 break;
                              }
                           }
                        } else {
                           if (~var10 > -98 || var10 > 122) {
                              break;
                           }

                           var10 -= 87;
                           if (var4) {
                              break;
                           }
                        }
                     } else {
                        if (~var10 > -98 || var10 > 122) {
                           break;
                        }

                        var10 -= 87;
                        if (var4) {
                           break;
                        }
                     }
                  }

                  if (~arg2 >= ~var10) {
                     return false;
                  }

                  if (var5) {
                     var10 = -var10;
                  }

                  int var11 = arg2 * var7 + var10;
                  if (var11 / arg2 != var7) {
                     return false;
                  }

                  var7 = var11;
                  var6 = 1;
                  ++var9;
               }

               if (var9 >= var8) {
                  var10000 = (char)var6;
                  if (!var4) {
                     return (boolean)var6;
                  }
               } else {
                  var10000 = arg1.charAt(var9);
               }
            }

            return false;
         } else {
            throw new IllegalArgumentException(field6113[5] + arg2);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6113[6] + arg0 + ',' + (arg1 != null ? field6113[4] : field6113[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class417(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field6104;
         return arg0 != 1 ? 126 : 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6113[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (super.field7906.field9144.method4125((byte)125) && super.field7905 == 2) {
            super.field7905 = 1;
         }

         ++field6111;
         if (arg0 != -22) {
            this.method97(-61);
         }

         if (~super.field7905 > -1 || super.field7905 > 2) {
            super.field7905 = this.method97(0);
         }

      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6113[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(Lcu;I)Lde;"
   )
   public static final class265 method3260(class65 arg0, int arg1) {
      try {
         ++field6112;
         if (arg1 != -49) {
            method3257(122, 27, (class311)null, -86, 20);
         }

         int var2 = arg0.method685(-2);
         return new class265(var2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6113[3] + (arg0 != null ? field6113[4] : field6113[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class417(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!fba",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method3261(int arg0) {
      try {
         ++field6105;
         return arg0 >= -52 ? 29 : super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6113[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
