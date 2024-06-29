import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 {
   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field147 = new String[]{method99(method98(",)\u0012k")), method99(method98("9rP)g")), method99(method98("&=\u001f)^j")), method99(method98("b\u000fD'")), method99(method98("&=\u001f)[j")), method99(method98("&=\u001f)_j")), method99(method98("&=\u001f)\\j")), method99(method98("&=\u001f)Yj"))};
   @OriginalMember(
      owner = "client!daa",
      name = "i",
      descriptor = "I"
   )
   public static int field138 = 0;
   @OriginalMember(
      owner = "client!daa",
      name = "e",
      descriptor = "I"
   )
   public static int field145 = 0;
   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "I"
   )
   public static int field136;
   @OriginalMember(
      owner = "client!daa",
      name = "h",
      descriptor = "I"
   )
   public static int field137;
   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "I"
   )
   public static int field140;
   @OriginalMember(
      owner = "client!daa",
      name = "g",
      descriptor = "I"
   )
   public static int field141;
   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "I"
   )
   public static int field143;
   @OriginalMember(
      owner = "client!daa",
      name = "j",
      descriptor = "I"
   )
   public static int field146;
   @OriginalMember(
      owner = "client!daa",
      name = "f",
      descriptor = "Lq;"
   )
   public static class454 field139;
   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "Lqh;"
   )
   public static class74 field144;
   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field142;

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method92(int arg0, int arg1) {
      try {
         class590 var2 = class305.field4046;
         synchronized(class305.field4046) {
            class305.field4046.method4234(2, arg1);
         }

         ++field146;
         class590 var3 = class468.field6450;
         synchronized(class468.field6450) {
            int var4 = -51 % ((26 - arg0) / 60);
            class468.field6450.method4234(2, arg1);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field147[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IIILgka;)Lgr;"
   )
   public static final class462 method93(int arg0, int arg1, int arg2, class394 arg3) {
      try {
         ++field140;
         int var4 = arg3.field5560 | arg1 << 10;
         class462 var5 = (class462)class243.field3036.method176(false, (long)var4 << 16);
         if (var5 != null) {
            return var5;
         } else {
            byte[] var6 = class694.field10159.method733(class694.field10159.method738(var4, -29588), (byte)-71);
            if (var6 != null) {
               if (~var6.length >= -2) {
                  return null;
               } else {
                  class462 var7;
                  try {
                     var7 = class636.method4615((byte)-124, var6);
                  } catch (Exception var20) {
                     throw new RuntimeException(var20.getMessage() + field147[3] + var4);
                  }

                  var7.field6320 = arg3;
                  class243.field3036.method175(0, (long)var4 << 16, var7);
                  return var7;
               }
            } else {
               int var9 = arg3.field5560 | arg2 + 65536 << 10;
               class462 var10 = (class462)class243.field3036.method176(false, (long)var9 << 16);
               if (var10 != null) {
                  return var10;
               } else {
                  if (arg0 != 0) {
                     field143 = 110;
                  }

                  byte[] var11 = class694.field10159.method733(class694.field10159.method738(var9, -29588), (byte)-71);
                  if (var11 != null) {
                     if (var11.length <= 1) {
                        return null;
                     } else {
                        class462 var12;
                        try {
                           var12 = class636.method4615((byte)-123, var11);
                        } catch (Exception var21) {
                           throw new RuntimeException(var21.getMessage() + field147[3] + var9);
                        }

                        var12.field6320 = arg3;
                        class243.field3036.method175(0, (long)var9 << 16, var12);
                        return var12;
                     }
                  } else {
                     int var14 = 67107840 | arg3.field5560;
                     class462 var15 = (class462)class243.field3036.method176(false, (long)var14 << 16);
                     if (var15 != null) {
                        return var15;
                     } else {
                        byte[] var16 = class694.field10159.method733(class694.field10159.method738(var14, -29588), (byte)-71);
                        if (var16 != null) {
                           if (var16.length <= 1) {
                              return null;
                           } else {
                              class462 var17;
                              try {
                                 var17 = class636.method4615((byte)33, var16);
                              } catch (Exception var22) {
                                 throw new RuntimeException(var22.getMessage() + field147[3] + var14);
                              }

                              var17.field6320 = arg3;
                              class243.field3036.method175(0, (long)var14 << 16, var17);
                              return var17;
                           }
                        } else {
                           return null;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field147[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field147[1] : field147[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method94(byte arg0) {
      try {
         field142 = null;
         int var1 = -72 % ((33 - arg0) / 35);
         field144 = null;
         field139 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field147[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(ZLdl;ILqh;BII)V"
   )
   public static final void method95(boolean arg0, class69 arg1, int arg2, class74 arg3, byte arg4, int arg5, int arg6) {
      try {
         ++field136;
         class307.method2305(arg6, arg0, (byte)120, arg3, arg2, arg5);
         if (arg4 == -60) {
            class728.field10669 = arg1;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field147[4] + arg0 + ',' + (arg1 != null ? field147[1] : field147[0]) + ',' + arg2 + ',' + (arg3 != null ? field147[1] : field147[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(III)Lcea;"
   )
   public static final class225 method96(int arg0, int arg1, int arg2) {
      if (class111.field1404[arg0][arg1][arg2] == null) {
         boolean var3 = class111.field1404[0][arg1][arg2] != null && class111.field1404[0][arg1][arg2].field2828 != null;
         if (var3 && arg0 >= class398.field5594 - 1) {
            return null;
         }

         class424.method3197(arg0, arg1, arg2);
      }

      return class111.field1404[arg0][arg1][arg2];
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(B)[Ldd;"
   )
   public static final class735[] method97(byte arg0) {
      try {
         ++field137;
         return arg0 > -59 ? null : new class735[]{class568.field7746, class790.field11560, class726.field10635, class343.field4926, class7.field59, class339.field4867, class192.field2345, class397.field5583, class223.field2783, class388.field5430, class734.field10731, class171.field2146, class177.field2202, class599.field8351};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field147[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method98(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method99(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
