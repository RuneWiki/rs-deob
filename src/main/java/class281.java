import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class281 extends class294 {
   @OriginalMember(
      owner = "client!ne",
      name = "t",
      descriptor = "I"
   )
   public int field4474;
   @OriginalMember(
      owner = "client!ne",
      name = "r",
      descriptor = "I"
   )
   public int field4467;
   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4475 = new String[]{method2354(method2353("~p0=L")), method2354(method2353("k;0R\u0019")), method2354(method2353("k+r\u007f")), method2354(method2353("k;0/Xk7j-\u0019")), method2354(method2353("k;0Q\u0019")), method2354(method2353(" m\u007f")), method2354(method2353("#(,.")), method2354(method2353(" l(")), method2354(method2353(" j.")), method2354(method2353(" l-")), method2354(method2353("f2wv_q;la^wpi`\u000efc")), method2354(method2353("#;#")), method2354(method2353("%\">")), method2354(method2353("#+#")), method2354(method2353("#(/.")), method2354(method2353("k;0W\u0019"))};
   @OriginalMember(
      owner = "client!ne",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field4472 = false;
   @OriginalMember(
      owner = "client!ne",
      name = "p",
      descriptor = "I"
   )
   public static int field4471 = -2;
   @OriginalMember(
      owner = "client!ne",
      name = "m",
      descriptor = "I"
   )
   public static int field4468;
   @OriginalMember(
      owner = "client!ne",
      name = "q",
      descriptor = "I"
   )
   public static int field4469;
   @OriginalMember(
      owner = "client!ne",
      name = "o",
      descriptor = "I"
   )
   public static int field4470;
   @OriginalMember(
      owner = "client!ne",
      name = "n",
      descriptor = "I"
   )
   public static int field4473;

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V"
   )
   public static final void method2349(int arg0, String arg1, Throwable arg2) {
      boolean var3 = client.field1786;
      ++field4468;

      try {
         String var4 = "";
         if (arg2 != null) {
            var4 = class98.method961(arg2, arg0 ^ 19011);
         }

         if (arg1 != null) {
            if (arg2 != null) {
               var4 = var4 + field4475[12];
            }

            var4 = var4 + arg1;
         }

         if (arg0 != 1) {
            method2349(94, (String)null, (Throwable)null);
         }

         class1.method3(var4, (byte)33);
         String var5 = class620.method4561(arg0 + 2956, field4475[5], ":", var4);
         String var6 = class620.method4561(2957, field4475[8], "@", var5);
         String var7 = class620.method4561(2957, field4475[7], "&", var6);
         String var8 = class620.method4561(2957, field4475[9], "#", var7);
         if (class113.field1549 != null) {
            class275 var9 = class502.field7669.method2441(new URL(class113.field1549.getCodeBase(), field4475[10] + class200.field3066 + field4475[13] + (class210.field3193 != null ? class210.field3193 : String.valueOf(class98.field1384)) + field4475[14] + class289.field4545 + field4475[6] + class289.field4546 + field4475[11] + var8), arg0 + 16979);
            if (var3) {
               class697.method5128(1L, 125);
            }

            while(~var9.field4398 == -1) {
               class697.method5128(1L, 125);
            }

            if (~var9.field4398 == -2) {
               DataInputStream var10 = (DataInputStream)var9.field4401;
               var10.read();
               var10.close();
            }
         }
      } catch (Exception var11) {
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(IIIIIII)Lpr;"
   )
   public static final class331 method2350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg1 != 0) {
            method2350(-44, 16, -69, -19, -73, 14, -70);
         }

         ++field4473;
         long var7 = (long)arg3 * 76724863L ^ (long)arg4 * 32147369L ^ (long)arg5 * 475427L ^ (long)arg2 * 97549L ^ (long)arg0 * 67481L ^ (long)arg6 * 986053L;
         class331 var9 = (class331)class153.field2290.method2544(false, var7);
         if (var9 != null) {
            return var9;
         } else {
            class331 var10 = class659.field9850.method607(arg0, arg2, arg5, arg6, arg4, arg3);
            class153.field2290.method2545(var7, 121, var10);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field4475[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(Lha;ILrr;)V"
   )
   public static final void method2351(class610 param0, int param1, class678 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(ILefa;)I"
   )
   public static final int method2352(int arg0, class466 arg1) {
      boolean var2 = client.field1786;

      try {
         ++field4470;
         class344 var3 = arg1.field7072;
         if (var3.field5221 != null) {
            var3 = var3.method2782((byte)-127, class45.field599);
            if (var3 == null) {
               return -1;
            }
         }

         int var4 = var3.field5239;
         class228 var5 = arg1.method1089(true);
         int var6 = arg1.field1616.method2995((byte)104);
         if (~var6 != arg0 && !arg1.field1656) {
            if (~var5.field3515 != ~var6 && var5.field3495 != var6 && ~var5.field3509 != ~var6 && var5.field3488 != var6) {
               if (~var5.field3505 != ~var6 && ~var5.field3481 != ~var6 && ~var5.field3460 != ~var6 && var5.field3478 != var6) {
                  return var4;
               }

               var4 = var3.field5277;
               if (!var2) {
                  return var4;
               }
            }

            var4 = var3.field5226;
            if (!var2) {
               return var4;
            }
         }

         var4 = var3.field5244;
         return var4;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4475[15] + arg0 + ',' + (arg1 != null ? field4475[0] : field4475[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class281(int arg0, int arg1) {
      try {
         this.field4474 = arg0;
         this.field4467 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4475[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2353(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2354(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 30;
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
