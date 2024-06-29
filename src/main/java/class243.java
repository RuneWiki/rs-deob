import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class243 {
   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3744 = new String[]{method2125(method2124("\u000b@\u001f=uV")), method2125(method2124("\u0010V\u0012\u007f")), method2125(method2124("\u0005\rP=L")), method2125(method2124("\u000b@\u001f=sV")), method2125(method2124("\u000b@\u001f=rV")), method2125(method2124("\u000b@\u001f=pV"))};
   @OriginalMember(
      owner = "client!uca",
      name = "d",
      descriptor = "F"
   )
   public static float field3742;
   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "I"
   )
   public static int field3734;
   @OriginalMember(
      owner = "client!uca",
      name = "h",
      descriptor = "I"
   )
   public static int field3736;
   @OriginalMember(
      owner = "client!uca",
      name = "i",
      descriptor = "I"
   )
   public static int field3739;
   @OriginalMember(
      owner = "client!uca",
      name = "b",
      descriptor = "I"
   )
   public static int field3741;
   @OriginalMember(
      owner = "client!uca",
      name = "j",
      descriptor = "I"
   )
   public static int field3743;
   @OriginalMember(
      owner = "client!uca",
      name = "c",
      descriptor = "[B"
   )
   public byte[] field3740;
   @OriginalMember(
      owner = "client!uca",
      name = "f",
      descriptor = "[S"
   )
   public short[] field3735;
   @OriginalMember(
      owner = "client!uca",
      name = "g",
      descriptor = "[S"
   )
   public short[] field3737;
   @OriginalMember(
      owner = "client!uca",
      name = "e",
      descriptor = "[S"
   )
   public short[] field3738;

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(I)Lrb;"
   )
   public static final class381 method2120(int arg0) {
      try {
         ++field3734;
         if (arg0 != 4795) {
            return null;
         } else {
            return class735.field10474 == 0 ? new class381() : class186.field2760[--class735.field10474];
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3744[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(IILjava/awt/Canvas;ILsa;Ld;)Lha;"
   )
   public static final class17 method2121(int arg0, int arg1, Canvas arg2, int arg3, class39 arg4, class672 arg5) {
      try {
         ++field3743;
         if (arg0 > -56) {
            return null;
         } else {
            int var6 = 0;
            int var7 = 0;
            if (arg2 != null) {
               Dimension var8 = arg2.getSize();
               var7 = var8.height;
               var6 = var8.width;
            }

            return class17.method222(arg5, (byte)-60, arg2, arg4, arg3, var6, arg1, var7);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3744[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3744[2] : field3744[1]) + ',' + arg3 + ',' + (arg4 != null ? field3744[2] : field3744[1]) + ',' + (arg5 != null ? field3744[2] : field3744[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "([BIIIII)Z"
   )
   public static final boolean method2122(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field3739;
         boolean var7 = true;
         class65 var8 = new class65(arg0);
         if (arg3 != -23) {
            field3742 = -0.49432898F;
         }

         int var9 = -1;

         label93:
         while(true) {
            int var10 = var8.method639(arg3 ^ -31328);
            int var10000 = ~var10;
            byte var10001 = -1;

            boolean var23;
            label90:
            while(var10000 != var10001) {
               var9 += var10;
               int var11 = 0;
               var23 = false;
               if (var6) {
                  return var23;
               }

               boolean var12 = false;

               label87:
               do {
                  while(true) {
                     if (!var12) {
                        int var13 = var8.method682(-103);
                        var10000 = ~var13;
                        var10001 = -1;
                        if (var6) {
                           continue label90;
                        }

                        if (var10000 == -1) {
                           break label87;
                        }

                        var11 += var13 + -1;
                        int var14 = 63 & var11;
                        int var15 = var11 >> 6 & 63;
                        int var16 = var8.method665(false) >> 2;
                        int var17 = arg4 + var15;
                        int var18 = var14 - -arg1;
                        if (~var17 >= -1 || ~var18 >= -1 || ~(arg2 + -1) >= ~var17 || ~(arg5 + -1) >= ~var18) {
                           continue;
                        }

                        class544 var19 = class549.field7834.method3850(arg3 + 3940, var9);
                        if (~var16 == -23 && ~class476.field6870.field9151.method847(-110) == -1 && var19.field7716 == 0 && var19.field7731 != 1 && !var19.field7703) {
                           break;
                        }

                        if (!var19.method4063(0)) {
                           ++class161.field2455;
                           var7 = false;
                        }

                        var12 = true;
                        if (!var6) {
                           continue;
                        }
                     }

                     int var20 = var8.method682(-114);
                     if (var20 == 0) {
                        break label87;
                     }

                     var8.method665(false);
                     break;
                  }
               } while(!var6);

               if (!var6) {
                  continue label93;
               }
               break;
            }

            var23 = var7;
            return var23;
         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field3744[5] + (arg0 != null ? field3744[2] : field3744[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method2123(byte param0, class17 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2124(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2125(char[] arg0) {
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
            var10005 = 35;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
