import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class430 {
   @OriginalMember(
      owner = "client!hja",
      name = "h",
      descriptor = "I"
   )
   private int field6148;
   @OriginalMember(
      owner = "client!hja",
      name = "g",
      descriptor = "J"
   )
   private long field6149;
   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6155 = new String[]{method3184(method3183("_H'\u0017C^L/MA\u001f")), method3184(method3183("YW*U")), method3184(method3183("L\fh\u0017\u0002")), method3184(method3183("_H'\u0017=\u001f")), method3184(method3183("_H'\u0017;\u001f")), method3184(method3183("_H'\u00178\u001f")), method3184(method3183("_H'\u0017<\u001f")), method3184(method3183("_H'\u0017>\u001f")), method3184(method3183("_H'\u0017:\u001f"))};
   @OriginalMember(
      owner = "client!hja",
      name = "l",
      descriptor = "Lhba;"
   )
   public static class10 field6143 = new class10();
   @OriginalMember(
      owner = "client!hja",
      name = "f",
      descriptor = "Lhba;"
   )
   public static class10 field6150 = new class10();
   @OriginalMember(
      owner = "client!hja",
      name = "d",
      descriptor = "[Lqn;"
   )
   public static class71[] field6153 = new class71[2048];
   @OriginalMember(
      owner = "client!hja",
      name = "e",
      descriptor = "[Lhba;"
   )
   public static class10[] field6154 = new class10[]{field6150, field6143};
   @OriginalMember(
      owner = "client!hja",
      name = "c",
      descriptor = "I"
   )
   public static int field6144;
   @OriginalMember(
      owner = "client!hja",
      name = "i",
      descriptor = "I"
   )
   public static int field6145;
   @OriginalMember(
      owner = "client!hja",
      name = "k",
      descriptor = "I"
   )
   public static int field6146;
   @OriginalMember(
      owner = "client!hja",
      name = "b",
      descriptor = "I"
   )
   public static int field6147;
   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "I"
   )
   public static int field6151;
   @OriginalMember(
      owner = "client!hja",
      name = "j",
      descriptor = "I"
   )
   public static int field6152;

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IB)I",
      line = 3
   )
   private final int method3176(int arg0, byte arg1) {
      try {
         ++field6145;
         if (arg1 < 71) {
            this.method3178((byte)-52, 11);
         }

         return 15 & (int)(this.field6149 >> class744.field10851 * arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6155[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(BLfka;)V",
      line = 14
   )
   private final void method3177(byte arg0, class744 arg1) {
      try {
         ++field6147;
         this.field6149 |= (long)(arg1.field10845 << this.field6148++ * class744.field10851);
         if (arg0 > -95) {
            field6143 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6155[7] + arg0 + ',' + (arg1 != null ? field6155[2] : field6155[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(BI)Lfka;",
      line = 28
   )
   public final class744 method3178(byte arg0, int arg1) {
      try {
         ++field6146;
         if (arg0 != 0) {
            field6150 = null;
         }

         return class744.method5392(this.method3176(arg1, (byte)87), arg0 ^ 118);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6155[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "b",
      descriptor = "(I)V",
      line = 39
   )
   public static final void method3179(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field6151;
         int var2 = class390.field5657;
         int[] var3 = class254.field3459;
         int var4 = 0;
         if (var1 || var2 > var4) {
            do {
               class121 var5 = class380.field5483[var3[var4]];
               if (var5 != null && var5.field3839 > 0) {
                  --var5.field3839;
                  if (var5.field3839 == 0) {
                     var5.field3811 = null;
                  }
               }

               ++var4;
            } while(var2 > var4);
         }

         int var6 = arg0;
         if (var1 || class475.field6836 > arg0) {
            do {
               long var7 = (long)class352.field4728[var6];
               class529 var9 = (class529)class328.field4479.method329((byte)-70, var7);
               if (var9 != null) {
                  class506 var10 = var9.field7559;
                  if (~var10.field3839 < -1) {
                     --var10.field3839;
                     if (~var10.field3839 == -1) {
                        var10.field3811 = null;
                     }
                  }
               }

               ++var6;
            } while(class475.field6836 > var6);

         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field6155[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(Lgl;Z)Z",
      line = 107
   )
   public static final boolean method3180(class627 arg0, boolean arg1) {
      boolean var2 = class757.field11220 == class731.field10698;
      int var3 = 0;
      short var4 = 0;
      byte var5 = 0;
      arg0.method2117(-127);
      if (arg0.field9207 >= 0 && arg0.field9208 >= 0 && arg0.field9211 < class457.field6539 && arg0.field9212 < class16.field190) {
         short var6 = 0;

         for(int var7 = arg0.field9207; var7 <= arg0.field9211; ++var7) {
            for(int var11 = arg0.field9208; var11 <= arg0.field9212; ++var11) {
               class517 var12 = class179.method1431(arg0.field10701, var7, var11);
               if (var12 != null) {
                  class772 var13 = class503.method3648(arg0, (byte)97);
                  class772 var14 = var12.field7468;
                  if (var14 == null) {
                     var12.field7468 = var13;
                  } else {
                     while(var14.field11354 != null) {
                        var14 = var14.field11354;
                     }

                     var14.field11354 = var13;
                  }

                  if (var2 && (class234.field3271[var7][var11] & -16777216) != 0) {
                     var3 = class234.field3271[var7][var11];
                     var4 = class17.field202[var7][var11];
                     var5 = class559.field8009[var7][var11];
                  }

                  if (!arg1 && var12.field7464 != null && var12.field7464.field3209 > var6) {
                     var6 = var12.field7464.field3209;
                  }
               }
            }
         }

         if (var2 && (var3 & -16777216) != 0) {
            for(int var8 = arg0.field9207; var8 <= arg0.field9211; ++var8) {
               for(int var9 = arg0.field9208; var9 <= arg0.field9212; ++var9) {
                  if ((class234.field3271[var8][var9] & -16777216) == 0) {
                     class234.field3271[var8][var9] = var3;
                     class17.field202[var8][var9] = var4;
                     class559.field8009[var8][var9] = var5;
                  }
               }
            }
         }

         if (arg1) {
            class541.field7770[class274.field3764++] = arg0;
         } else {
            int var10 = class757.field11220 == class731.field10698 ? 1 : 0;
            if (arg0.method253((byte)-125)) {
               if (arg0.method238((byte)98)) {
                  arg0.field10695 = class392.field5677[var10];
                  class392.field5677[var10] = arg0;
               } else {
                  arg0.field10695 = class591.field8705[var10];
                  class591.field8705[var10] = arg0;
                  class171.field2384 = true;
               }
            } else {
               arg0.field10695 = class756.field11204[var10];
               class756.field11204[var10] = arg0;
            }
         }

         if (arg1) {
            arg0.field10697 -= var6;
         }

         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(Z)V",
      line = 239
   )
   public static void method3181(boolean arg0) {
      try {
         field6143 = null;
         field6150 = null;
         field6154 = null;
         field6153 = null;
         if (arg0) {
            method3179(62);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6155[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(I)I",
      line = 253
   )
   public final int method3182(int arg0) {
      try {
         if (arg0 <= 65) {
            return 43;
         } else {
            ++field6144;
            return this.field6148;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6155[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "<init>",
      descriptor = "(Lfka;)V",
      line = 270
   )
   public class430(class744 arg0) {
      try {
         this.field6148 = 1;
         this.field6149 = (long)arg0.field10845;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6155[0] + (arg0 != null ? field6155[2] : field6155[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "<init>",
      descriptor = "([Lfka;)V",
      line = 278
   )
   public class430(class744[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3184(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
