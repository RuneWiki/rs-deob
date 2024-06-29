import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class561 extends class96 {
   @OriginalMember(
      owner = "client!fa",
      name = "m",
      descriptor = "[I"
   )
   public int[] field8337;
   @OriginalMember(
      owner = "client!fa",
      name = "l",
      descriptor = "[I"
   )
   public int[] field8339;
   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8343 = new String[]{method4237(method4236("H\u001bw-\u0016")), method4237(method4236("H\u001bw.\u0016")), method4237(method4236("UTwBC")), method4237(method4236("\u000e)cL")), method4237(method4236("@\u000f5\u0000")), method4237(method4236("H\u001bwPW@\u0013-R\u0016"))};
   @OriginalMember(
      owner = "client!fa",
      name = "i",
      descriptor = "Let;"
   )
   public static class389 field8338 = new class389(8);
   @OriginalMember(
      owner = "client!fa",
      name = "n",
      descriptor = "I"
   )
   public static int field8341 = 0;
   @OriginalMember(
      owner = "client!fa",
      name = "j",
      descriptor = "I"
   )
   public static int field8336;
   @OriginalMember(
      owner = "client!fa",
      name = "h",
      descriptor = "I"
   )
   public static int field8340;
   @OriginalMember(
      owner = "client!fa",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8342;

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(Ldha;III)Leq;"
   )
   public static final class305 method4234(class642 arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8336;
         int var4 = arg3 << 10 | arg0.field9295;
         class305 var5 = (class305)class511.field7812.method3178(0, (long)var4 << 16);
         if (var5 != null) {
            return var5;
         } else {
            byte[] var6 = class357.field5518.method5025(0, class357.field5518.method5013((byte)-81, var4));
            if (var6 != null) {
               if (~var6.length >= -2) {
                  return null;
               } else {
                  class305 var7;
                  try {
                     var7 = class9.method64(-20943, var6);
                  } catch (Exception var21) {
                     throw new RuntimeException(var21.getMessage() + field8343[3] + var4);
                  }

                  var7.field4782 = arg0;
                  class511.field7812.method3183((long)var4 << 16, var7, (byte)84);
                  return var7;
               }
            } else {
               int var9 = -16 / ((arg2 - -87) / 34);
               int var10 = arg0.field9295 | arg1 + 65536 << 10;
               class305 var11 = (class305)class511.field7812.method3178(0, (long)var10 << 16);
               if (var11 != null) {
                  return var11;
               } else {
                  byte[] var12 = class357.field5518.method5025(0, class357.field5518.method5013((byte)40, var10));
                  if (var12 != null) {
                     if (var12.length <= 1) {
                        return null;
                     } else {
                        class305 var13;
                        try {
                           var13 = class9.method64(-20943, var12);
                        } catch (Exception var22) {
                           throw new RuntimeException(var22.getMessage() + field8343[3] + var10);
                        }

                        var13.field4782 = arg0;
                        class511.field7812.method3183((long)var10 << 16, var13, (byte)80);
                        return var13;
                     }
                  } else {
                     int var15 = arg0.field9295 | 67107840;
                     class305 var16 = (class305)class511.field7812.method3178(0, (long)var15 << 16);
                     if (var16 != null) {
                        return var16;
                     } else {
                        byte[] var17 = class357.field5518.method5025(0, class357.field5518.method5013((byte)96, var15));
                        if (var17 != null) {
                           if (var17.length <= 1) {
                              return null;
                           } else {
                              class305 var18;
                              try {
                                 var18 = class9.method64(-20943, var17);
                              } catch (Exception var23) {
                                 throw new RuntimeException(var23.getMessage() + field8343[3] + var15);
                              }

                              var18.field4782 = arg0;
                              class511.field7812.method3183((long)var15 << 16, var18, (byte)72);
                              return var18;
                           }
                        } else {
                           return null;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var24) {
         throw class482.method3757(var24, field8343[1] + (arg0 != null ? field8343[2] : field8343[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4235(int arg0) {
      try {
         if (arg0 == 65536) {
            field8338 = null;
            field8342 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8343[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "<init>",
      descriptor = "(II[I[I)V"
   )
   public class561(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         this.field8337 = arg2;
         this.field8339 = arg3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8343[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8343[2] : field8343[4]) + ',' + (arg3 != null ? field8343[2] : field8343[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4236(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4237(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
