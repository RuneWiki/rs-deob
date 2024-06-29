import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class427 {
   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6184 = new String[]{method3230(method3229("9i3]k")), method3230(method3229("9i3Zk")), method3230(method3229("g92},\";")), method3230(method3229("n9~q/s5-x%v5#")), method3230(method3229("n9~q/sc{x%~5#")), method3230(method3229("n9~q/sc{x%(c#")), method3230(method3229("n-")), method3230(method3229("9i3[k")), method3230(method3229("r*~q/p")), method3230(method3229("9i3Yk"))};
   @OriginalMember(
      owner = "client!wl",
      name = "c",
      descriptor = "I"
   )
   public static int field6180;
   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "I"
   )
   public static int field6181;
   @OriginalMember(
      owner = "client!wl",
      name = "d",
      descriptor = "I"
   )
   public static int field6182;
   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "I"
   )
   public static int field6183;

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(I)J"
   )
   public abstract long method3141(int arg0);

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3225(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6180;
         int var5 = 0;
         if (arg0 == -1) {
            while(~var5 > ~class656.field9577) {
               Rectangle var6 = class211.field3153[var5];
               if (~arg1 > ~(var6.x + var6.width) && var6.x < arg1 - -arg2 && arg4 < var6.y + var6.height && ~var6.y > ~(arg4 - -arg3)) {
                  class36.field892[var5] = true;
               }

               ++var5;
            }

            class670.method4896(arg1 + arg2, 0, arg1, arg3 + arg4, arg4);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6184[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method3226(int arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field6182;
         String var3 = Integer.toString(arg0);
         if (arg1 != 7776) {
            method3225(52, -90, -58, -5, 22);
         }

         int var4 = var3.length() + -3;
         if (var2) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
            var4 -= 3;
         }

         while(true) {
            while(~var4 < -1) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }

            if (!var2) {
               if (~var3.length() < -10) {
                  return field6184[3] + var3.substring(0, var3.length() - 8) + class100.field1632.method961(class385.field5684, true) + field6184[6] + var3 + field6184[2];
               }

               if (~var3.length() < -7) {
                  return field6184[5] + var3.substring(0, var3.length() - 4) + class100.field1634.method961(class385.field5684, true) + field6184[6] + var3 + field6184[2];
               }

               return field6184[4] + var3 + field6184[8];
            }

            var3 = var3;
            var4 -= 3;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6184[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(IJ)I"
   )
   public final int method3227(int arg0, long arg1) {
      try {
         ++field6181;
         long var4 = this.method3141(-23401);
         if (var4 > (long)arg0) {
            class624.method4569((byte)98, var4);
         }

         return this.method3139(arg1, true);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6184[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method3138(int arg0);

   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3228(int arg0) {
      try {
         ++field6183;
         if (arg0 == -3) {
            if (class495.field7248 != null) {
               try {
                  class495.field7248.close();
               } catch (IOException var2) {
               }
            }

            class495.field7248 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6184[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(B)J"
   )
   public abstract long method3140(byte arg0);

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(JZ)I"
   )
   public abstract int method3139(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3229(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3230(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
