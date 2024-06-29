import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class736 {
   @OriginalMember(
      owner = "client!pw",
      name = "o",
      descriptor = "Z"
   )
   public boolean field10749 = false;
   @OriginalMember(
      owner = "client!pw",
      name = "h",
      descriptor = "I"
   )
   public int field10754 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "f",
      descriptor = "Z"
   )
   public boolean field10757 = false;
   @OriginalMember(
      owner = "client!pw",
      name = "n",
      descriptor = "Z"
   )
   public boolean field10759 = false;
   @OriginalMember(
      owner = "client!pw",
      name = "c",
      descriptor = "Lse;"
   )
   public class269 field10751 = null;
   @OriginalMember(
      owner = "client!pw",
      name = "q",
      descriptor = "[S"
   )
   public short[] field10746;
   @OriginalMember(
      owner = "client!pw",
      name = "i",
      descriptor = "[S"
   )
   public short[] field10750;
   @OriginalMember(
      owner = "client!pw",
      name = "j",
      descriptor = "[S"
   )
   public short[] field10755;
   @OriginalMember(
      owner = "client!pw",
      name = "p",
      descriptor = "[S"
   )
   public short[] field10745;
   @OriginalMember(
      owner = "client!pw",
      name = "d",
      descriptor = "[S"
   )
   public short[] field10758;
   @OriginalMember(
      owner = "client!pw",
      name = "l",
      descriptor = "[B"
   )
   public byte[] field10744;
   @OriginalMember(
      owner = "client!pw",
      name = "k",
      descriptor = "[B"
   )
   private static byte[] field10743 = new byte[500];
   @OriginalMember(
      owner = "client!pw",
      name = "e",
      descriptor = "[S"
   )
   private static short[] field10753 = new short[500];
   @OriginalMember(
      owner = "client!pw",
      name = "g",
      descriptor = "[S"
   )
   private static short[] field10747 = new short[500];
   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "[S"
   )
   private static short[] field10748 = new short[500];
   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field10756 = new short[500];
   @OriginalMember(
      owner = "client!pw",
      name = "m",
      descriptor = "[S"
   )
   private static short[] field10752 = new short[500];

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "()V",
      line = 13
   )
   public static void method5348() {
      field10752 = null;
      field10748 = null;
      field10753 = null;
      field10756 = null;
      field10747 = null;
      field10743 = null;
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "([BLse;)V",
      line = 65
   )
   public class736(byte[] arg0, class269 arg1) {
      this.field10751 = arg1;

      try {
         class147 var3 = new class147(arg0);
         class147 var4 = new class147(arg0);
         var3.method1143(-15465);
         var3.field1856 += 2;
         int var5 = var3.method1143(-15465);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field1856 = var3.field1856 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field10751.field3717[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method1143(-15465);
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field10752[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field10748[var6] = (short)var4.method1147(-64);
               } else {
                  field10748[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field10753[var6] = (short)var4.method1147(-64);
               } else {
                  field10753[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field10756[var6] = (short)var4.method1147(-64);
               } else {
                  field10756[var6] = var12;
               }

               field10743[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field10748[var6] = (short)(field10748[var6] << 2 & 16383);
                  field10753[var6] = (short)(field10753[var6] << 2 & 16383);
                  field10756[var6] = (short)(field10756[var6] << 2 & 16383);
               }

               field10747[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field10757 = true;
                  } else if (var10 == 7) {
                     this.field10749 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field10759 = true;
                  }
               } else if (var7 > var8) {
                  field10747[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (arg0.length != var4.field1856) {
            throw new RuntimeException();
         } else {
            this.field10754 = var6;
            this.field10746 = new short[var6];
            this.field10750 = new short[var6];
            this.field10755 = new short[var6];
            this.field10745 = new short[var6];
            this.field10758 = new short[var6];
            this.field10744 = new byte[var6];

            for(int var13 = 0; var13 < var6; ++var13) {
               this.field10746[var13] = field10752[var13];
               this.field10750[var13] = field10748[var13];
               this.field10755[var13] = field10753[var13];
               this.field10745[var13] = field10756[var13];
               this.field10758[var13] = field10747[var13];
               this.field10744[var13] = field10743[var13];
            }

         }
      } catch (Exception var14) {
         this.field10754 = 0;
         this.field10757 = false;
         this.field10749 = false;
      }
   }
}
