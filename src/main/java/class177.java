import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class177 {
   @OriginalMember(
      owner = "client!cfa",
      name = "l",
      descriptor = "Ljk;"
   )
   public class658 field2723 = null;
   @OriginalMember(
      owner = "client!cfa",
      name = "k",
      descriptor = "Z"
   )
   public boolean field2727 = false;
   @OriginalMember(
      owner = "client!cfa",
      name = "i",
      descriptor = "Z"
   )
   public boolean field2729 = false;
   @OriginalMember(
      owner = "client!cfa",
      name = "c",
      descriptor = "I"
   )
   public int field2732 = 0;
   @OriginalMember(
      owner = "client!cfa",
      name = "q",
      descriptor = "Z"
   )
   public boolean field2733 = false;
   @OriginalMember(
      owner = "client!cfa",
      name = "d",
      descriptor = "[S"
   )
   public short[] field2726;
   @OriginalMember(
      owner = "client!cfa",
      name = "h",
      descriptor = "[S"
   )
   public short[] field2728;
   @OriginalMember(
      owner = "client!cfa",
      name = "n",
      descriptor = "[S"
   )
   public short[] field2735;
   @OriginalMember(
      owner = "client!cfa",
      name = "b",
      descriptor = "[S"
   )
   public short[] field2725;
   @OriginalMember(
      owner = "client!cfa",
      name = "j",
      descriptor = "[S"
   )
   public short[] field2722;
   @OriginalMember(
      owner = "client!cfa",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field2721;
   @OriginalMember(
      owner = "client!cfa",
      name = "p",
      descriptor = "[S"
   )
   private static short[] field2720 = new short[500];
   @OriginalMember(
      owner = "client!cfa",
      name = "f",
      descriptor = "[S"
   )
   private static short[] field2719 = new short[500];
   @OriginalMember(
      owner = "client!cfa",
      name = "g",
      descriptor = "[S"
   )
   private static short[] field2724 = new short[500];
   @OriginalMember(
      owner = "client!cfa",
      name = "o",
      descriptor = "[S"
   )
   private static short[] field2730 = new short[500];
   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field2731 = new short[500];
   @OriginalMember(
      owner = "client!cfa",
      name = "e",
      descriptor = "[B"
   )
   private static byte[] field2734 = new byte[500];

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "()V",
      line = 6
   )
   public static void method1565() {
      field2719 = null;
      field2731 = null;
      field2724 = null;
      field2720 = null;
      field2730 = null;
      field2734 = null;
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "<init>",
      descriptor = "([BLjk;)V",
      line = 62
   )
   public class177(byte[] arg0, class658 arg1) {
      this.field2723 = arg1;

      try {
         class473 var3 = new class473(arg0);
         class473 var4 = new class473(arg0);
         var3.method3564((byte)-55);
         var3.field6907 += 2;
         int var5 = var3.method3564((byte)-71);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field6907 = var3.field6907 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field2723.field9597[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method3564((byte)-85);
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field2719[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field2731[var6] = (short)var4.method3531(-12504);
               } else {
                  field2731[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field2724[var6] = (short)var4.method3531(-12504);
               } else {
                  field2724[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field2720[var6] = (short)var4.method3531(-12504);
               } else {
                  field2720[var6] = var12;
               }

               field2734[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field2731[var6] = (short)(field2731[var6] << 2 & 16383);
                  field2724[var6] = (short)(field2724[var6] << 2 & 16383);
                  field2720[var6] = (short)(field2720[var6] << 2 & 16383);
               }

               field2730[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field2733 = true;
                  } else if (var10 == 7) {
                     this.field2729 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field2727 = true;
                  }
               } else if (var7 > var8) {
                  field2730[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (arg0.length != var4.field6907) {
            throw new RuntimeException();
         } else {
            this.field2732 = var6;
            this.field2726 = new short[var6];
            this.field2728 = new short[var6];
            this.field2735 = new short[var6];
            this.field2725 = new short[var6];
            this.field2722 = new short[var6];
            this.field2721 = new byte[var6];

            for(int var13 = 0; var13 < var6; ++var13) {
               this.field2726[var13] = field2719[var13];
               this.field2728[var13] = field2731[var13];
               this.field2735[var13] = field2724[var13];
               this.field2725[var13] = field2720[var13];
               this.field2722[var13] = field2730[var13];
               this.field2721[var13] = field2734[var13];
            }

         }
      } catch (Exception var14) {
         this.field2732 = 0;
         this.field2733 = false;
         this.field2729 = false;
      }
   }
}
