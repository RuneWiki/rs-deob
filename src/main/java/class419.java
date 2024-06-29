import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class419 extends class557 {
   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6127 = new String[]{method3274(method3273("bz-|\u001f")), method3274(method3273("bz-~\u001f")), method3274(method3273("m3-\u0011J")), method3274(method3273("xhoS")), method3274(method3273("bz-}\u001f")), method3274(method3273("bz-z\u001f")), method3274(method3273("bz-u\u001f")), method3274(method3273("bz-{\u001f")), method3274(method3273("bz-y\u001f")), method3274(method3273("bz-x\u001f"))};
   @OriginalMember(
      owner = "client!tg",
      name = "n",
      descriptor = "I"
   )
   public static int field6119;
   @OriginalMember(
      owner = "client!tg",
      name = "m",
      descriptor = "I"
   )
   public static int field6120;
   @OriginalMember(
      owner = "client!tg",
      name = "j",
      descriptor = "I"
   )
   public static int field6121;
   @OriginalMember(
      owner = "client!tg",
      name = "k",
      descriptor = "I"
   )
   public static int field6122;
   @OriginalMember(
      owner = "client!tg",
      name = "l",
      descriptor = "I"
   )
   public static int field6123;
   @OriginalMember(
      owner = "client!tg",
      name = "i",
      descriptor = "I"
   )
   public static int field6124;
   @OriginalMember(
      owner = "client!tg",
      name = "h",
      descriptor = "I"
   )
   public static int field6125;
   @OriginalMember(
      owner = "client!tg",
      name = "o",
      descriptor = "I"
   )
   public static int field6126;

   @OriginalMember(
      owner = "client!tg",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            return -94;
         } else {
            ++field6121;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6127[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(IIIII)I"
   )
   public static final int method3269(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6119;
         int var5 = 11 / ((arg0 - 48) / 61);
         int var6 = -class160.field2446[arg2 * 8192 / arg3] + 65536 >> 1;
         return ((65536 - var6) * arg4 >> 16) + (arg1 * var6 >> 16);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6127[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class419(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (~super.field7905 != -2 && ~super.field7905 != -1) {
            super.field7905 = this.method97(arg0 ^ -22);
         }

         ++field6123;
         if (arg0 != -22) {
            method3271((byte)-14, (class578)null);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6127[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method3270(-104);
         }

         ++field6126;
         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6127[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3270(int arg0) {
      try {
         if (arg0 > -52) {
            return 118;
         } else {
            ++field6120;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6127[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(BLwb;)Lqu;"
   )
   public static final class84 method3271(byte arg0, class578 arg1) {
      try {
         class84 var2;
         label21: {
            ++field6122;
            if (class62.field878 != null) {
               var2 = class62.field878;
               class62.field878 = class62.field878.field1305;
               var2.field1305 = null;
               --class171.field2568;
               if (!client.field10022) {
                  break label21;
               }
            }

            var2 = new class84();
         }

         var2.field1299 = arg1;
         int var3 = 116 / ((27 - arg0) / 62);
         return var2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6127[4] + arg0 + ',' + (arg1 != null ? field6127[2] : field6127[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(IZLjava/lang/String;)V"
   )
   public static final void method3272(int arg0, boolean arg1, String arg2) {
      try {
         ++field6125;
         class198.method1739(arg1, arg0, false, -1, arg2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6127[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6127[2] : field6127[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            method3272(-120, false, (String)null);
         }

         ++field6124;
         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6127[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class419(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3273(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3274(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
