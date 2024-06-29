import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class741 {
   @OriginalMember(
      owner = "client!mga",
      name = "m",
      descriptor = "I"
   )
   public int field10796;
   @OriginalMember(
      owner = "client!mga",
      name = "d",
      descriptor = "I"
   )
   public int field10804;
   @OriginalMember(
      owner = "client!mga",
      name = "j",
      descriptor = "I"
   )
   public int field10801;
   @OriginalMember(
      owner = "client!mga",
      name = "g",
      descriptor = "I"
   )
   public int field10792;
   @OriginalMember(
      owner = "client!mga",
      name = "k",
      descriptor = "S"
   )
   public short field10793;
   @OriginalMember(
      owner = "client!mga",
      name = "i",
      descriptor = "I"
   )
   public int field10803;
   @OriginalMember(
      owner = "client!mga",
      name = "b",
      descriptor = "Z"
   )
   public boolean field10797;
   @OriginalMember(
      owner = "client!mga",
      name = "n",
      descriptor = "B"
   )
   public byte field10791;
   @OriginalMember(
      owner = "client!mga",
      name = "e",
      descriptor = "S"
   )
   public short field10798;
   @OriginalMember(
      owner = "client!mga",
      name = "c",
      descriptor = "S"
   )
   public short field10795;
   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10805 = new String[]{method5370(method5369("_4\u0003s5[=\u000b)7\u001a")), method5370(method5369("I}Lst")), method5370(method5369("\\&\u000e1")), method5370(method5369("_4\u0003sH\u001a")), method5370(method5369("_4\u0003sK\u001a"))};
   @OriginalMember(
      owner = "client!mga",
      name = "h",
      descriptor = "I"
   )
   public static int field10800 = 0;
   @OriginalMember(
      owner = "client!mga",
      name = "l",
      descriptor = "I"
   )
   public static int field10794;
   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "I"
   )
   public static int field10799;
   @OriginalMember(
      owner = "client!mga",
      name = "f",
      descriptor = "I"
   )
   public static int field10802;

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Leb;I)Leb;"
   )
   public static final class657 method5367(class657 arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field10802;
         if (~arg0.field9363 != 0) {
            return class420.method3176(arg0.field9363, -106);
         } else {
            int var3 = arg0.field9220 >>> 16;
            class428 var4 = new class428(class202.field2476);
            class588 var5 = (class588)var4.method3212((byte)117);
            if (var2) {
               if (~var5.field8107 == ~var3) {
                  return class420.method3176((int)var5.field6862, -105);
               }

               var5 = (class588)var4.method3213(19037);
            }

            while(true) {
               int var10000;
               int var10001;
               if (var5 == null) {
                  var10000 = arg1;
                  var10001 = -65;
                  if (!var2) {
                     if (arg1 > -65) {
                        method5367((class657)null, -61);
                     }

                     return null;
                  }
               } else {
                  var10000 = ~var5.field8107;
                  var10001 = ~var3;
               }

               if (var10000 == var10001) {
                  return class420.method3176((int)var5.field6862, -105);
               }

               var5 = (class588)var4.method3213(19037);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10805[3] + (arg0 != null ? field10805[1] : field10805[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(IIIIIB)V"
   )
   public static final void method5368(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      boolean var6 = client.field4273;

      try {
         ++field10794;
         if (class313.field4171 >= arg0 && ~class478.field6604 >= ~arg4) {
            label160: {
               boolean var7;
               label142: {
                  if (~class265.field3451 >= ~arg2) {
                     if (class663.field9442 < arg2) {
                        var7 = false;
                        arg2 = class663.field9442;
                        if (!var6) {
                           break label142;
                        }
                     }

                     var7 = true;
                     if (!var6) {
                        break label142;
                     }
                  }

                  arg2 = class265.field3451;
                  var7 = false;
               }

               boolean var8;
               label150: {
                  if (~class265.field3451 < ~arg3) {
                     var8 = false;
                     arg3 = class265.field3451;
                     if (!var6) {
                        break label150;
                     }
                  }

                  if (arg3 > class663.field9442) {
                     var8 = false;
                     arg3 = class663.field9442;
                     if (!var6) {
                        break label150;
                     }
                  }

                  var8 = true;
               }

               label126: {
                  if (~class478.field6604 < ~arg0) {
                     arg0 = class478.field6604;
                     if (!var6) {
                        break label126;
                     }
                  }

                  class125.method1046(-23355, arg3, class17.field236[arg0++], arg1, arg2);
               }

               label121: {
                  if (~class313.field4171 > ~arg4) {
                     arg4 = class313.field4171;
                     if (!var6) {
                        break label121;
                     }
                  }

                  class125.method1046(-23355, arg3, class17.field236[arg4--], arg1, arg2);
               }

               if (!var7 || !var8) {
                  if (var7) {
                     int var9 = arg0;
                     if (var6) {
                        class17.field236[arg0][arg2] = arg1;
                        var9 = arg0 + 1;
                     }

                     while(true) {
                        while(arg4 >= var9) {
                           class17.field236[var9][arg2] = arg1;
                           ++var9;
                        }

                        if (!var6) {
                           if (!var6) {
                              break label160;
                           }
                           break;
                        }

                        ++var9;
                     }
                  }

                  if (!var8) {
                     break label160;
                  }

                  int var10 = arg0;
                  if (var6) {
                     class17.field236[arg0][arg3] = arg1;
                     var10 = arg0 + 1;
                  }

                  while(true) {
                     while(~var10 >= ~arg4) {
                        class17.field236[var10][arg3] = arg1;
                        ++var10;
                     }

                     if (!var6) {
                        if (!var6) {
                           break label160;
                        }
                        break;
                     }

                     ++var10;
                  }
               }

               int var11 = arg0;
               if (var6 || arg0 <= arg4) {
                  do {
                     int[] var12 = class17.field236[var11];
                     var12[arg2] = var12[arg3] = arg1;
                     ++var11;
                  } while(var11 <= arg4);
               }
            }
         }

         int var13 = -26 / ((-45 - arg5) / 52);
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field10805[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field10796 = arg3;
         this.field10804 = arg11;
         this.field10801 = arg0;
         this.field10792 = arg2;
         this.field10793 = (short)arg4;
         this.field10803 = arg1;
         this.field10797 = arg10;
         this.field10791 = (byte)arg8;
         this.field10798 = (short)arg6;
         this.field10795 = (short)arg5;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field10805[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
