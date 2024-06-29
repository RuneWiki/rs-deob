import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class302 extends class648 {
   @OriginalMember(
      owner = "client!ov",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4733 = new String[]{method2531(method2530("[I,s9")), method2531(method2530("[I,t9")), method2531(method2530("[I,q9")), method2531(method2530("O\u0011,\u001el")), method2531(method2530("[I,v9")), method2531(method2530("ZJn\\")), method2531(method2530("[I,x9")), method2531(method2530("[I,r9"))};
   @OriginalMember(
      owner = "client!ov",
      name = "D",
      descriptor = "I"
   )
   public static int field4724;
   @OriginalMember(
      owner = "client!ov",
      name = "C",
      descriptor = "I"
   )
   public static int field4726;
   @OriginalMember(
      owner = "client!ov",
      name = "w",
      descriptor = "I"
   )
   public static int field4727;
   @OriginalMember(
      owner = "client!ov",
      name = "x",
      descriptor = "I"
   )
   public static int field4728;
   @OriginalMember(
      owner = "client!ov",
      name = "y",
      descriptor = "I"
   )
   public static int field4729;
   @OriginalMember(
      owner = "client!ov",
      name = "A",
      descriptor = "I"
   )
   public static int field4730;
   @OriginalMember(
      owner = "client!ov",
      name = "E",
      descriptor = "I"
   )
   public static int field4732;
   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "[B"
   )
   private byte[] field4731;
   @OriginalMember(
      owner = "client!ov",
      name = "B",
      descriptor = "[Ljq;"
   )
   public static class672[] field4725;

   @OriginalMember(
      owner = "client!ov",
      name = "<init>",
      descriptor = "()V",
      line = 3
   )
   public class302() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "(IIZI)[B",
      line = 7
   )
   public final byte[] method2525(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field4727;
         this.field4731 = new byte[arg0 * arg1 * 2 * arg3];
         if (!arg2) {
            this.method2525(31, 55, false, -24);
         }

         this.method4171(arg3, arg0, false, arg1);
         return this.field4731;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4733[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "c",
      descriptor = "(B)V",
      line = 20
   )
   public static void method2526(byte arg0) {
      try {
         field4725 = null;
         if (arg0 != -38) {
            method2528(-99);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4733[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "(III)Z",
      line = 31
   )
   public static final boolean method2527(int arg0, int arg1, int arg2) {
      try {
         ++field4729;
         if (arg2 != -9) {
            method2526((byte)2);
         }

         if (~arg0 == -12) {
            arg0 = 10;
         }

         class333 var3 = class102.field1434.method1411(arg1, arg2 ^ 115);
         if (arg0 >= 5 && ~arg0 >= -9) {
            arg0 = 4;
         }

         return var3.method2715(arg0, 21188);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4733[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(IBI)V",
      line = 59
   )
   public final void method2289(int arg0, byte arg1, int arg2) {
      try {
         ++field4724;
         if (arg2 >= -22) {
            this.method2289(-78, (byte)113, 62);
         }

         byte var7 = (byte)((arg1 >> 1 & 127) + 127);
         int var4 = arg0 * 2;
         int var8 = var4 + 1;
         this.field4731[var4] = var7;
         this.field4731[var8] = var7;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4733[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "c",
      descriptor = "(I)I",
      line = 74
   )
   public static final int method2528(int arg0) {
      try {
         if (arg0 != -1) {
            field4726 = -107;
         }

         ++field4728;
         return class443.field6804.method1339((byte)97);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4733[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(III[BII)Z",
      line = 87
   )
   public static final boolean method2529(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field4732;
         boolean var7 = true;
         class354 var8 = new class354(arg3);
         int var9 = -1;
         if (arg4 <= 77) {
            method2529(-20, 45, 115, (byte[])null, 124, -82);
         }

         boolean var10000;
         while(true) {
            int var10 = var8.method2880((byte)-74);
            if (~var10 != -1) {
               var9 += var10;
               int var11 = 0;
               var10000 = false;
               if (var6) {
                  break;
               }

               boolean var12 = false;

               label83:
               do {
                  int var23;
                  while(true) {
                     if (!var12) {
                        int var13 = var8.method2896(0);
                        var23 = var13;
                        if (var6) {
                           break;
                        }

                        if (var13 == 0) {
                           break label83;
                        }

                        var11 += var13 + -1;
                        int var14 = var11 & 63;
                        int var15 = (var11 & 4085) >> 6;
                        int var16 = var8.method2855(-31007) >> 2;
                        int var17 = var15 - -arg0;
                        int var18 = arg5 + var14;
                        if (var17 <= 0 || ~var18 >= -1 || ~var17 <= ~(arg1 + -1) || var18 >= arg2 + -1) {
                           continue;
                        }

                        class333 var19 = class102.field1434.method1411(var9, -64);
                        if (~var16 == -23 && class687.field10213.field534.method5283(480102311) == 0 && var19.field5071 == 0 && ~var19.field5052 != -2 && !var19.field5131) {
                           continue label83;
                        }

                        var12 = true;
                        if (var19.method2716(101)) {
                           continue;
                        }

                        var7 = false;
                        ++class338.field5181;
                        if (!var6) {
                           continue;
                        }
                     }

                     int var20 = var8.method2896(0);
                     var23 = var20;
                     break;
                  }

                  if (var23 == 0) {
                     break;
                  }

                  var8.method2855(-31007);
               } while(!var6);

               if (!var6) {
                  continue;
               }
            }

            var10000 = var7;
            break;
         }

         return var10000;
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field4733[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4733[3] : field4733[5]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2530(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2531(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
