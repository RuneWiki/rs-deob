import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class389 {
   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5746 = new String[]{method3020(method3019("B\nB[}")), method3020(method3019("[\n\u0000t")), method3020(method3019("B\nB]}")), method3020(method3019("NQB6(")), method3020(method3019("B\nBY}")), method3020(method3019("B\nBZ}")), method3020(method3019("\u0015,V8")), method3020(method3019("B\nB\\}"))};
   @OriginalMember(
      owner = "client!wu",
      name = "c",
      descriptor = "Lhm;"
   )
   public static class230 field5742 = new class230(2, 4, 4, 0);
   @OriginalMember(
      owner = "client!wu",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field5745 = false;
   @OriginalMember(
      owner = "client!wu",
      name = "b",
      descriptor = "I"
   )
   public static int field5739;
   @OriginalMember(
      owner = "client!wu",
      name = "e",
      descriptor = "I"
   )
   public static int field5740;
   @OriginalMember(
      owner = "client!wu",
      name = "d",
      descriptor = "I"
   )
   public static int field5741;
   @OriginalMember(
      owner = "client!wu",
      name = "f",
      descriptor = "I"
   )
   public static int field5743;
   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "[Lvca;"
   )
   public static class294[] field5744;

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(ILha;ILiw;I)V"
   )
   public static final void method3014(int arg0, class65 arg1, int arg2, class332 arg3, int arg4) {
      boolean var5 = client.field4564;

      try {
         ++field5741;
         class791.field11560.method2580((byte)-4);
         if (!class185.field2809) {
            if (arg0 == -268689328) {
               class269 var6 = (class269)arg3.method2579(-801);
               if (var5 || var6 != null) {
                  do {
                     class155 var7 = class370.field5480.method3207(var6.field3806, arg0 + 268689364);
                     if (class191.method1664((byte)-80, var7)) {
                        boolean var8 = class481.method3637(arg2, var7, var6, arg1, arg4, (byte)-126);
                        if (var8) {
                           class34.method247(118, var7, var6, arg1);
                        }
                     }

                     var6 = (class269)arg3.method2583(1);
                  } while(var6 != null);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field5746[4] + arg0 + ',' + (arg1 != null ? field5746[3] : field5746[1]) + ',' + arg2 + ',' + (arg3 != null ? field5746[3] : field5746[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(IIILnia;I)V"
   )
   public static final void method3015(int param0, int param1, int param2, class670 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(IIILkea;)Ldja;"
   )
   public static final class323 method3016(int arg0, int arg1, int arg2, class248 arg3) {
      try {
         ++field5743;
         int var4 = arg2 << 10 | arg3.field3573;
         class323 var5 = (class323)class201.field3007.method162((long)var4 << 16, arg1 ^ -23008);
         if (var5 != null) {
            return var5;
         } else {
            if (arg1 != -22957) {
               field5744 = null;
            }

            byte[] var6 = class647.field9406.method1331((byte)-98, class647.field9406.method1340(-9686, var4));
            if (var6 != null) {
               if (var6.length <= 1) {
                  return null;
               } else {
                  class323 var7;
                  try {
                     var7 = class729.method5264(-109, var6);
                  } catch (Exception var20) {
                     throw new RuntimeException(var20.getMessage() + field5746[6] + var4);
                  }

                  var7.field4660 = arg3;
                  class201.field3007.method164((long)var4 << 16, var7, (byte)21);
                  return var7;
               }
            } else {
               int var9 = arg0 + 65536 << 10 | arg3.field3573;
               class323 var10 = (class323)class201.field3007.method162((long)var9 << 16, 121);
               if (var10 != null) {
                  return var10;
               } else {
                  byte[] var11 = class647.field9406.method1331((byte)-98, class647.field9406.method1340(-9686, var9));
                  if (var11 != null) {
                     if (~var11.length >= -2) {
                        return null;
                     } else {
                        class323 var12;
                        try {
                           var12 = class729.method5264(-46, var11);
                        } catch (Exception var21) {
                           throw new RuntimeException(var21.getMessage() + field5746[6] + var9);
                        }

                        var12.field4660 = arg3;
                        class201.field3007.method164((long)var9 << 16, var12, (byte)-123);
                        return var12;
                     }
                  } else {
                     int var14 = 67107840 | arg3.field3573;
                     class323 var15 = (class323)class201.field3007.method162((long)var14 << 16, arg1 + 23061);
                     if (var15 != null) {
                        return var15;
                     } else {
                        byte[] var16 = class647.field9406.method1331((byte)-98, class647.field9406.method1340(-9686, var14));
                        if (var16 != null) {
                           if (~var16.length >= -2) {
                              return null;
                           } else {
                              class323 var17;
                              try {
                                 var17 = class729.method5264(arg1 ^ 22977, var16);
                              } catch (Exception var22) {
                                 throw new RuntimeException(var22.getMessage() + field5746[6] + var14);
                              }

                              var17.field4660 = arg3;
                              class201.field3007.method164((long)var14 << 16, var17, (byte)34);
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
         throw class608.method4462(var23, field5746[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5746[3] : field5746[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3017(int arg0) {
      try {
         field5744 = null;
         field5742 = null;
         if (arg0 != 30002) {
            method3014(-124, (class65)null, 77, (class332)null, -107);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5746[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(Ljfa;I)Ljfa;"
   )
   public static final class303 method3018(class303 arg0, int arg1) {
      try {
         if (arg1 != 23274) {
            field5745 = false;
         }

         ++field5740;
         class303 var2 = client.method2464(arg0);
         if (var2 == null) {
            var2 = arg0.field4326;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5746[2] + (arg0 != null ? field5746[3] : field5746[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3019(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3020(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
