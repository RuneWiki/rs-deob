import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class752 extends class55 {
   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11130 = new String[]{method5459(method5458("U@]/U")), method5459(method5458("U@]+U")), method5459(method5458("U@]*U")), method5459(method5458("J\u001c]B\u0000")), method5459(method5458("U@].U")), method5459(method5458("_G\u001f\u0000")), method5459(method5458("U@])U")), method5459(method5458("U@](U")), method5459(method5458("U@]$U")), method5459(method5458("U@]-U"))};
   @OriginalMember(
      owner = "client!dr",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field11119 = new int[3];
   @OriginalMember(
      owner = "client!dr",
      name = "h",
      descriptor = "I"
   )
   public static int field11120;
   @OriginalMember(
      owner = "client!dr",
      name = "f",
      descriptor = "I"
   )
   public static int field11121;
   @OriginalMember(
      owner = "client!dr",
      name = "i",
      descriptor = "I"
   )
   public static int field11122;
   @OriginalMember(
      owner = "client!dr",
      name = "e",
      descriptor = "I"
   )
   public static int field11124;
   @OriginalMember(
      owner = "client!dr",
      name = "m",
      descriptor = "I"
   )
   public static int field11125;
   @OriginalMember(
      owner = "client!dr",
      name = "k",
      descriptor = "I"
   )
   public static int field11126;
   @OriginalMember(
      owner = "client!dr",
      name = "o",
      descriptor = "I"
   )
   public static int field11127;
   @OriginalMember(
      owner = "client!dr",
      name = "g",
      descriptor = "I"
   )
   public static int field11129;
   @OriginalMember(
      owner = "client!dr",
      name = "l",
      descriptor = "Loe;"
   )
   public static class214 field11123;
   @OriginalMember(
      owner = "client!dr",
      name = "n",
      descriptor = "[Lgn;"
   )
   public static class731[] field11128;

   @OriginalMember(
      owner = "client!dr",
      name = "c",
      descriptor = "(I)V",
      line = 12
   )
   public static void method5454(int arg0) {
      try {
         field11128 = null;
         field11123 = null;
         field11119 = null;
         if (arg0 != 0) {
            method5454(84);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11130[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 24
   )
   public class752(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "(I)I",
      line = 27
   )
   public final int method101(int arg0) {
      try {
         if (arg0 >= -116) {
            field11123 = null;
         }

         ++field11125;
         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11130[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(IB)I",
      line = 39
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field11126;
         return arg1 != 105 ? -56 : 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11130[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "([[BLrga;I)V",
      line = 50
   )
   public static final void method5455(byte[][] arg0, class253 arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field11127;
         int[] var4 = new int[]{-1, 0, 0, 0, 0};
         int var5 = arg0.length;
         int var6 = 0;
         if (var3 || var5 > var6) {
            do {
               byte[] var7 = arg0[var6];
               if (var7 != null) {
                  class147 var8 = new class147(var7);
                  int var9 = class436.field6245[var6] >> 8;
                  int var10 = 255 & class436.field6245[var6];
                  int var11 = var9 * 64 + -class672.field9740;
                  int var12 = var10 * 64 - class533.field7595;
                  class581.method4207(50);
                  arg1.method4858(class533.field7595, var12, 8, class672.field9740, class767.field11309, var8, var11);
                  arg1.method1939(var12, class383.field5543, (byte)-122, var11, var4, var8);
                  if (!arg1.field9691 && ~(class72.field877 / 8) == ~var9 && class53.field676 / 8 == var10 && var4[0] != -1) {
                     class566.field8064 = class685.field10097.method671(var4[1], var4[3], var4[2], (byte)112, class426.field6104, var4[0]);
                     class209.field2977 = var4[4];
                  }
               }

               ++var6;
            } while(var5 > var6);
         }

         int var13 = 0;
         int var10000;
         int var10001;
         if (var3) {
            var10000 = -class672.field9740;
            var10001 = (class436.field6245[var13] >> 8) * 64;
         } else if (~var13 <= ~var5) {
            var10000 = arg2;
            var10001 = -92;
            if (!var3) {
               if (arg2 >= -92) {
                  method5454(-92);
                  return;
               }

               return;
            }
         } else {
            var10000 = -class672.field9740;
            var10001 = (class436.field6245[var13] >> 8) * 64;
         }

         while(true) {
            int var14 = var10000 + var10001;
            int var15 = (255 & class436.field6245[var13]) * 64 - class533.field7595;
            byte[] var16 = arg0[var13];
            if (var16 == null && class53.field676 < 800) {
               class581.method4207(50);
               arg1.method4863(64, (byte)-125, var14, 64, var15);
            }

            ++var13;
            if (~var13 <= ~var5) {
               var10000 = arg2;
               var10001 = -92;
               if (!var3) {
                  if (arg2 >= -92) {
                     method5454(-92);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = -class672.field9740;
               var10001 = (class436.field6245[var13] >> 8) * 64;
            }
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field11130[4] + (arg0 != null ? field11130[3] : field11130[5]) + ',' + (arg1 != null ? field11130[3] : field11130[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(I)V",
      line = 124
   )
   public final void method98(int arg0) {
      try {
         ++field11129;
         if (super.field683.method3308(1) == class152.field2126) {
            super.field680 = 2;
         }

         if (arg0 > super.field680 || super.field680 > 2) {
            super.field680 = this.method101(-117);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11130[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(ILud;IIII)V",
      line = 138
   )
   public static final void method5456(int arg0, class39 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         ++field11121;
         class294 var7 = null;
         int var8 = -125 / ((-32 - arg5) / 33);
         class294 var9 = (class294)class761.field11242.method2933(2);
         if (var6 || var9 != null) {
            do {
               if (var9.field4052 == arg4 && ~var9.field4051 == ~arg3 && ~var9.field4056 == ~arg2 && ~var9.field4049 == ~arg0) {
                  var7 = var9;
                  break;
               }

               var9 = (class294)class761.field11242.method2940(false);
            } while(var9 != null);
         }

         while(var6) {
         }

         if (var7 == null) {
            var7 = new class294();
            var7.field4056 = arg2;
            var7.field4049 = arg0;
            var7.field4052 = arg4;
            var7.field4051 = arg3;
            class761.field11242.method2930((byte)-66, var7);
         }

         var7.field4054 = true;
         var7.field4059 = arg1;
         var7.field4060 = false;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field11130[7] + arg0 + ',' + (arg1 != null ? field11130[3] : field11130[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "d",
      descriptor = "(I)I",
      line = 179
   )
   public final int method5457(int arg0) {
      try {
         ++field11120;
         int var2 = -74 % ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11130[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 189
   )
   public class752(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "(IB)V",
      line = 193
   )
   public final void method96(int arg0, byte arg1) {
      try {
         super.field680 = arg0;
         ++field11124;
         int var3 = 55 % ((47 - arg1) / 46);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11130[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5458(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5459(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
