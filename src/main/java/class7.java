import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!c")
public class class7 {
   @OriginalMember(
      owner = "loginapplet!c",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class41 field59 = class8.method31(122, "");
   @OriginalMember(
      owner = "loginapplet!c",
      name = "b",
      descriptor = "F"
   )
   public float field60;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "c",
      descriptor = "F"
   )
   public float field61;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "d",
      descriptor = "F"
   )
   public float field62;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "e",
      descriptor = "F"
   )
   public float field63;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field64 = false;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "g",
      descriptor = "Z"
   )
   public boolean field65 = false;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "h",
      descriptor = "Z"
   )
   public boolean field66 = false;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "i",
      descriptor = "I"
   )
   public int field67;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "j",
      descriptor = "I"
   )
   public int field68;
   @OriginalMember(
      owner = "loginapplet!c",
      name = "k",
      descriptor = "[B"
   )
   public static byte[] field69;

   @OriginalMember(
      owner = "loginapplet!c",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public final void method26(byte arg0) {
      try {
         if (arg0 != -36) {
            this.field66 = false;
         }

         this.field62 += this.field61;
         this.field60 += this.field63;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "c.E(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!c",
      name = "a",
      descriptor = "(FFFFII)V",
      line = 20
   )
   public final void method27(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
      try {
         this.field66 = false;
         if (arg5 < -86) {
            this.field61 = arg3;
            this.field62 = arg2;
            this.field67 = 0;
            this.field63 = arg1;
            this.field60 = arg0;
            this.field68 = arg4;
         }
      } catch (RuntimeException var8) {
         throw class28.method139(var8, "c.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!c",
      name = "a",
      descriptor = "(I[B)V",
      line = 38
   )
   public static final void method28(int arg0, byte[] arg1) {
      try {
         class13 var2 = new class13(arg1);
         var2.field105 = -2 + arg1.length;
         class46.field340 = var2.method67((byte)9);
         class9.field75 = new int[class46.field340];
         class13.field101 = new int[class46.field340];
         class32.field205 = new int[class46.field340];
         class9.field76 = new int[class46.field340];
         class22.field153 = new byte[class46.field340][];
         var2.field105 = -(class46.field340 * 8) + -7 + arg1.length;
         var2.method67((byte)-45);
         var2.method67((byte)99);
         int var3 = 1 + (var2.method66(false) & 255);

         int var4;
         for(var4 = 0; var4 < class46.field340; ++var4) {
            class9.field75[var4] = var2.method67((byte)107);
         }

         var4 = 0;
         if (arg0 > 93) {
            while(var4 < class46.field340) {
               class32.field205[var4] = var2.method67((byte)98);
               ++var4;
            }

            for(var4 = 0; ~class46.field340 < ~var4; ++var4) {
               class13.field101[var4] = var2.method67((byte)126);
            }

            for(var4 = 0; ~class46.field340 < ~var4; ++var4) {
               class9.field76[var4] = var2.method67((byte)-124);
            }

            var2.field105 = -(8 * class46.field340) + arg1.length + -7 + -(3 * (-1 + var3));
            class14.field113 = new int[var3];

            for(var4 = 1; ~var3 < ~var4; ++var4) {
               class14.field113[var4] = var2.method61(1740634296);
               if (class14.field113[var4] == 0) {
                  class14.field113[var4] = 1;
               }
            }

            var2.field105 = 0;

            for(var4 = 0; ~class46.field340 < ~var4; ++var4) {
               int var6 = class9.field76[var4];
               int var5 = class13.field101[var4];
               int var7 = var6 * var5;
               byte[] var8 = new byte[var7];
               class22.field153[var4] = var8;
               int var9 = var2.method66(false);
               int var10;
               if (~var9 == -1) {
                  for(var10 = 0; var10 < var7; ++var10) {
                     var8[var10] = var2.method57(-8897);
                  }
               } else if (-2 == ~var9) {
                  for(var10 = 0; var10 < var5; ++var10) {
                     for(int var11 = 0; var6 > var11; ++var11) {
                        var8[var5 * var11 + var10] = var2.method57(-8897);
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var12) {
         throw class28.method139(var12, "c.D(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!c",
      name = "a",
      descriptor = "(IFF)V",
      line = 173
   )
   public final void method29(int arg0, float arg1, float arg2) {
      try {
         this.field60 += arg2;
         if (arg0 >= -37) {
            this.field66 = false;
         }

         this.field63 = arg2;
         this.field62 += arg1;
         this.field61 = arg1;
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "c.A(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!c",
      name = "b",
      descriptor = "(B)V",
      line = 196
   )
   public static void method30(byte arg0) {
      try {
         field69 = null;
         field59 = null;
         if (arg0 < 7) {
            field64 = true;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "c.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!c",
      name = "<init>",
      descriptor = "(FFFFI)V",
      line = 205
   )
   public class7(float arg0, float arg1, float arg2, float arg3, int arg4) {
      try {
         this.field62 = arg0;
         this.field63 = arg3;
         this.field68 = arg4;
         this.field60 = arg1;
         this.field67 = 0;
         this.field61 = arg2;
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "c.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }
}
