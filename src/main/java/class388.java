import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class388 {
   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "I"
   )
   public int field6095 = -1;
   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6101 = new String[]{method3137(method3136("\u0007>i\u00055")), method3137(method3136("\u0004++#=")), method3137(method3136("\u0004++!=")), method3137(method3136("\u0004++\"="))};
   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "I"
   )
   public static int field6092 = -1;
   @OriginalMember(
      owner = "client!wp",
      name = "h",
      descriptor = "I"
   )
   public static int field6093;
   @OriginalMember(
      owner = "client!wp",
      name = "c",
      descriptor = "I"
   )
   public static int field6094;
   @OriginalMember(
      owner = "client!wp",
      name = "e",
      descriptor = "I"
   )
   public static int field6097;
   @OriginalMember(
      owner = "client!wp",
      name = "g",
      descriptor = "I"
   )
   public static int field6098;
   @OriginalMember(
      owner = "client!wp",
      name = "j",
      descriptor = "Leq;"
   )
   public class305 field6091;
   @OriginalMember(
      owner = "client!wp",
      name = "f",
      descriptor = "[I"
   )
   public int[] field6100;
   @OriginalMember(
      owner = "client!wp",
      name = "d",
      descriptor = "[J"
   )
   public long[] field6099;
   @OriginalMember(
      owner = "client!wp",
      name = "i",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field6096;

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method3133(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 != 11301) {
            method3133(-66, -43, -3, 21);
         }

         ++field6098;
         String var4 = field6101[0] + arg3 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (63 & arg0) + "," + (63 & arg2);
         System.out.println(var4);
         class121.method1120(true, var4, (byte)123, false);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6101[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method3134(boolean arg0, int arg1) {
      try {
         ++field6097;
         class566 var2 = class146.method1321((long)arg1, 7, -1428737160);
         if (!arg0) {
            field6093 = -78;
         }

         var2.method4268(4);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6101[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3135(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field6094;
         class441 var2 = null;

         try {
            class275 var3 = class498.field7578.method2433("", true, (byte)127);
            if (var1) {
               class697.method5128(1L, -89);
            }

            while(var3.field4398 == 0) {
               class697.method5128(1L, -89);
            }

            if (~var3.field4398 == -2) {
               var2 = (class441)var3.field4401;
               class354 var4 = class687.field10213.method291((byte)89);
               var2.method3474((byte)127, var4.field5428, 0, var4.field5436);
            }
         } catch (Exception var7) {
         }

         try {
            if (arg0 != 0) {
               method3134(false, -71);
            }

            if (var2 != null) {
               var2.method3477((byte)125);
            }
         } catch (Exception var6) {
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6101[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
