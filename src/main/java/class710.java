import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class710 {
   @OriginalMember(
      owner = "client!ar",
      name = "d",
      descriptor = "Lma;"
   )
   public class14 field10598 = new class14();
   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "Z"
   )
   public boolean field10601 = false;
   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10603 = new String[]{method5151(method5150("^Us\u0014\b")), method5151(method5150("^Us\u0013\b")), method5151(method5150("^Us\u0010\b")), method5151(method5150("^Us\u0012\b")), method5151(method5150("QR1=")), method5151(method5150("D\ts\u007f]")), method5151(method5150("^Us\u0015\b")), method5151(method5150("^UsmIQN)o\b")), method5151(method5150("^Us\u0017\b"))};
   @OriginalMember(
      owner = "client!ar",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field10599 = true;
   @OriginalMember(
      owner = "client!ar",
      name = "i",
      descriptor = "I"
   )
   public static int field10594;
   @OriginalMember(
      owner = "client!ar",
      name = "f",
      descriptor = "I"
   )
   public static int field10595;
   @OriginalMember(
      owner = "client!ar",
      name = "h",
      descriptor = "I"
   )
   public static int field10597;
   @OriginalMember(
      owner = "client!ar",
      name = "g",
      descriptor = "I"
   )
   public static int field10600;
   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "I"
   )
   public static int field10602;
   @OriginalMember(
      owner = "client!ar",
      name = "c",
      descriptor = "Ljfa;"
   )
   public static class303 field10596;

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5144(boolean arg0) {
      int var2 = client.field4530;

      try {
         while(true) {
            class319 var3 = (class319)this.field10598.method101(-9167);
            if (var3 != null) {
               var3.method4413((byte)72);
               class326.method2462(-201, var3);
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            }

            if (!arg0) {
               this.field10601 = false;
            }

            ++field10600;
            break;
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10603[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(ILvw;)V"
   )
   public final void method5145(int param1, class319 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(B)Lbe;"
   )
   public static final class41 method5146(byte arg0) {
      try {
         ++field10595;
         class41 var1 = (class41)class619.field9027.method101(-9167);
         int var2 = -62 % ((arg0 - 22) / 38);
         if (var1 != null) {
            --class511.field7501;
            return var1;
         } else {
            return new class41();
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10603[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5147(int arg0) {
      try {
         if (arg0 > 85) {
            field10596 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10603[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method5148(byte arg0, int arg1, int arg2) {
      try {
         ++field10594;
         if (arg0 > -46) {
            method5148((byte)104, 47, -105);
         }

         return (arg1 & 262144) != 0 | class436.method3306(arg1, -125, arg2) || class672.method4895(-18045, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10603[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5149(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10597;
         class403 var5 = class453.method3410((long)arg3, true, arg4);
         var5.method3093(22144);
         var5.field6185 = arg0;
         var5.field6187 = arg2;
         var5.field6183 = arg1;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10603[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class710(boolean arg0) {
      try {
         this.field10601 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10603[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5150(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5151(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
