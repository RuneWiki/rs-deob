import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class500 {
   @OriginalMember(
      owner = "client!hba",
      name = "j",
      descriptor = "I"
   )
   public volatile int field122 = -1;
   @OriginalMember(
      owner = "client!hba",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public volatile String field123;
   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field127 = new String[]{method88(method87(";*\"90{")), method88(method87("(fm9\f")), method88(method87("==/{")), method88(method87(";*\"9M:&*cO{")), method88(method87(";*\"93{")), method88(method87(";*\"92{"))};
   @OriginalMember(
      owner = "client!hba",
      name = "n",
      descriptor = "I"
   )
   public static int field124;
   @OriginalMember(
      owner = "client!hba",
      name = "p",
      descriptor = "I"
   )
   public static int field125;
   @OriginalMember(
      owner = "client!hba",
      name = "k",
      descriptor = "I"
   )
   public static int field126;
   @OriginalMember(
      owner = "client!hba",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public static String field121;
   @OriginalMember(
      owner = "client!hba",
      name = "l",
      descriptor = "[Lbo;"
   )
   public static class763[] field120;

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method84(int arg0, int arg1, int arg2) {
      try {
         ++field126;
         arg1 = (127 & arg0) * arg1 >> 7;
         if (~arg1 <= -3) {
            if (arg1 <= 126) {
               return arg2 != -30135 ? -109 : (arg0 & 65408) + arg1;
            }

            arg1 = 126;
            if (!client.field4273) {
               return arg2 != -30135 ? -109 : (arg0 & 65408) + arg1;
            }
         }

         arg1 = 2;
         return arg2 != -30135 ? -109 : (arg0 & 65408) + arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field127[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "([BIII)Ljava/lang/String;"
   )
   public static final String method85(byte[] arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field124;
         char[] var5 = new char[arg1];
         int var6 = arg3;
         int var7 = arg2;
         int var8 = arg1 + arg2;
         if (!var4 && ~var8 >= ~arg2) {
            return new String(var5, 0, arg3);
         } else {
            do {
               int var9 = 255 & arg0[var7++];
               int var10;
               if (var9 < 128) {
                  if (var9 != 0) {
                     var10 = var9;
                     if (var4) {
                        var10 = 65533;
                     }
                  } else {
                     var10 = 65533;
                  }
               } else {
                  label141: {
                     if (var9 >= 192) {
                        if (~var9 <= -225) {
                           if (~var9 > -241) {
                              if (~(var7 + 1) > ~var8 && ~(192 & arg0[var7]) == -129 && (arg0[var7 - -1] & 192) == 128) {
                                 var10 = (var9 & 15) << 12 | (arg0[var7++] & 63) << 6 | arg0[var7++] & 63;
                                 if (var10 >= 2048) {
                                    break label141;
                                 }

                                 var10 = 65533;
                                 if (!var4) {
                                    break label141;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label141;
                              }
                           }

                           if (~var9 <= -249) {
                              var10 = 65533;
                              if (!var4) {
                                 break label141;
                              }
                           }

                           if (~(var7 - -2) > ~var8 && ~(arg0[var7] & 192) == -129 && ~(arg0[var7 + 1] & 192) == -129 && (192 & arg0[var7 - -2]) == 128) {
                              int var11 = (arg0[var7++] & 63) << 12 | (7 & var9) << 18 | (arg0[var7++] & 63) << 6 | 63 & arg0[var7++];
                              if (var11 < 65536 || var11 > 1114111) {
                                 var10 = 65533;
                                 if (!var4) {
                                    break label141;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label141;
                              }
                           }

                           var10 = 65533;
                           if (!var4) {
                              break label141;
                           }
                        }

                        if (var8 <= var7 || (arg0[var7] & 192) != 128) {
                           var10 = 65533;
                           if (!var4) {
                              break label141;
                           }
                        }

                        var10 = 63 & arg0[var7++] | 1984 & var9 << 6;
                        if (~var10 <= -129) {
                           break label141;
                        }

                        var10 = 65533;
                        if (!var4) {
                           break label141;
                        }
                     }

                     var10 = 65533;
                     if (var4) {
                        if (var9 != 0) {
                           var10 = var9;
                           if (var4) {
                              var10 = 65533;
                           }
                        } else {
                           var10 = 65533;
                        }
                     }
                  }
               }

               var5[var6++] = (char)var10;
            } while(~var8 < ~var7);

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field127[5] + (arg0 != null ? field127[1] : field127[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class10(String arg0) {
      try {
         this.field123 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field127[3] + (arg0 != null ? field127[1] : field127[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method86(int arg0) {
      try {
         field120 = null;
         int var1 = 113 % ((-65 - arg0) / 42);
         field121 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field127[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method87(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method88(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
