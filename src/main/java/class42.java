import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!t")
public class class42 {
   @OriginalMember(
      owner = "loginapplet!t",
      name = "a",
      descriptor = "I"
   )
   public static int field323 = 20;

   @OriginalMember(
      owner = "loginapplet!t",
      name = "a",
      descriptor = "(Z)J",
      line = 8
   )
   public static final synchronized long method212(boolean arg0) {
      try {
         if (!arg0) {
            method215(-29, (byte[])null);
         }

         long var1 = System.currentTimeMillis();
         if (class4.field14 > var1) {
            class13.field107 += class4.field14 + -var1;
         }

         class4.field14 = var1;
         return var1 - -class13.field107;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "t.C(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!t",
      name = "a",
      descriptor = "(II)V",
      line = 33
   )
   public static final void method213(int arg0, int arg1) {
      try {
         for(int var2 = 0; ~var2 > -3; ++var2) {
            int var3 = var2 * 100 + -40;

            for(int var4 = 0; ~var4 > -5; ++var4) {
               int var7 = 5 * var4 + 4 * (var2 + 1);
               int var5 = var4 * 5 + 7 * var2 + 7;
               int var6 = 6 * var2 - (-6 - var4 * 5);
               int var8 = var3 + (int)(0.5D + (double)var5 * Math.sin((double)arg0 * class8.field71[var2][0]) + Math.sin((double)arg0 * class12.field96[var2][0]) * (double)var6 + Math.sin(class34.field226[var2][0] * (double)arg0) * (double)var7) + 100;
               int var10 = 0;
               int var9 = var8;

               for(int var11 = 1; ~var11 > -401; ++var11) {
                  var8 = (int)((double)var5 * Math.sin(class8.field71[var2][1] * (double)var11 + (double)arg0 * class8.field71[var2][0]) + (double)var6 * Math.sin((double)var11 * class12.field96[var2][1] + (double)arg0 * class12.field96[var2][0]) + Math.sin(class34.field226[var2][0] * (double)arg0 + class34.field226[var2][1] * (double)var11) * (double)var7 + 0.5D) + 100 + var3;
                  class21.method106(var10, var9, var11, var8, class19.method94(-12118));
                  var10 = var11;
                  var9 = var8;
               }

               boolean var13 = false;
            }
         }

         if (arg1 >= -119) {
            field323 = 5;
         }

      } catch (RuntimeException var12) {
         throw class28.method139(var12, "t.D(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!t",
      name = "a",
      descriptor = "(I)Laa;",
      line = 103
   )
   public static final class2 method214(int arg0) {
      try {
         class2 var1 = new class2();
         var1.field6 = class9.field76[arg0];
         var1.field7 = class32.field205[0];
         var1.field5 = class9.field75[0];
         var1.field8 = class13.field101[0];
         byte[] var3 = class22.field153[0];
         int var2 = var1.field6 * var1.field8;
         var1.field4 = new int[var2];

         for(int var4 = 0; ~var4 > ~var2; ++var4) {
            var1.field4[var4] = class14.field113[class10.method38(var3[var4], 255)];
         }

         class10.method42(-1);
         return var1;
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "t.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!t",
      name = "a",
      descriptor = "(I[B)[B",
      line = 135
   )
   public static final byte[] method215(int arg0, byte[] arg1) {
      try {
         class13 var2 = new class13(arg1);
         if (arg0 != 3268) {
            return (byte[])null;
         } else {
            int var3 = var2.method66(false);
            int var4 = var2.method64(-1);
            if (var4 < 0 || 0 != class29.field201 && class29.field201 < var4) {
               throw new RuntimeException();
            } else if (-1 == ~var3) {
               byte[] var8 = new byte[var4];
               var2.method75(var8, var4, arg0 ^ -3322, 0);
               return var8;
            } else {
               int var5 = var2.method64(-1);
               if (0 > var5 || -1 != ~class29.field201 && var5 > class29.field201) {
                  throw new RuntimeException();
               } else {
                  byte[] var6 = new byte[var5];
                  if (-2 != ~var3) {
                     class39.field297.method154(65, var2, var6);
                  } else {
                     class30.method146(var6, var5, arg1, var4, 9);
                  }

                  return var6;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "t.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }
}
