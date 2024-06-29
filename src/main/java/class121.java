import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class121 {
   @OriginalMember(
      owner = "client!ri",
      name = "o",
      descriptor = "Lsi;"
   )
   public class585 field1473 = null;
   @OriginalMember(
      owner = "client!ri",
      name = "b",
      descriptor = "Z"
   )
   public boolean field1468 = false;
   @OriginalMember(
      owner = "client!ri",
      name = "q",
      descriptor = "Z"
   )
   public boolean field1475 = false;
   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "I"
   )
   public int field1470 = 0;
   @OriginalMember(
      owner = "client!ri",
      name = "g",
      descriptor = "Z"
   )
   public boolean field1476 = false;
   @OriginalMember(
      owner = "client!ri",
      name = "e",
      descriptor = "[S"
   )
   public short[] field1467;
   @OriginalMember(
      owner = "client!ri",
      name = "h",
      descriptor = "[S"
   )
   public short[] field1479;
   @OriginalMember(
      owner = "client!ri",
      name = "f",
      descriptor = "[S"
   )
   public short[] field1464;
   @OriginalMember(
      owner = "client!ri",
      name = "l",
      descriptor = "[S"
   )
   public short[] field1466;
   @OriginalMember(
      owner = "client!ri",
      name = "p",
      descriptor = "[S"
   )
   public short[] field1478;
   @OriginalMember(
      owner = "client!ri",
      name = "i",
      descriptor = "[B"
   )
   public byte[] field1471;
   @OriginalMember(
      owner = "client!ri",
      name = "n",
      descriptor = "[S"
   )
   private static short[] field1465 = new short[500];
   @OriginalMember(
      owner = "client!ri",
      name = "k",
      descriptor = "[S"
   )
   private static short[] field1469 = new short[500];
   @OriginalMember(
      owner = "client!ri",
      name = "m",
      descriptor = "[B"
   )
   private static byte[] field1472 = new byte[500];
   @OriginalMember(
      owner = "client!ri",
      name = "j",
      descriptor = "[S"
   )
   private static short[] field1474 = new short[500];
   @OriginalMember(
      owner = "client!ri",
      name = "d",
      descriptor = "[S"
   )
   private static short[] field1463 = new short[500];
   @OriginalMember(
      owner = "client!ri",
      name = "c",
      descriptor = "[S"
   )
   private static short[] field1477 = new short[500];

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "()V",
      line = 7
   )
   public static void method1007() {
      field1469 = null;
      field1463 = null;
      field1465 = null;
      field1477 = null;
      field1474 = null;
      field1472 = null;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "<init>",
      descriptor = "([BLsi;)V",
      line = 65
   )
   public class121(byte[] arg0, class585 arg1) {
      this.field1473 = arg1;

      try {
         class128 var3 = new class128(arg0);
         class128 var4 = new class128(arg0);
         var3.method1104(255);
         var3.field1590 += 2;
         int var5 = var3.method1104(255);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field1590 = var3.field1590 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field1473.field8687[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method1104(255);
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field1469[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field1463[var6] = (short)var4.method1098(-2883);
               } else {
                  field1463[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field1465[var6] = (short)var4.method1098(-2883);
               } else {
                  field1465[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field1477[var6] = (short)var4.method1098(-2883);
               } else {
                  field1477[var6] = var12;
               }

               field1472[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field1463[var6] = (short)(field1463[var6] << 2 & 16383);
                  field1465[var6] = (short)(field1465[var6] << 2 & 16383);
                  field1477[var6] = (short)(field1477[var6] << 2 & 16383);
               }

               field1474[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field1475 = true;
                  } else if (var10 == 7) {
                     this.field1476 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field1468 = true;
                  }
               } else if (var7 > var8) {
                  field1474[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (arg0.length != var4.field1590) {
            throw new RuntimeException();
         } else {
            this.field1470 = var6;
            this.field1467 = new short[var6];
            this.field1479 = new short[var6];
            this.field1464 = new short[var6];
            this.field1466 = new short[var6];
            this.field1478 = new short[var6];
            this.field1471 = new byte[var6];

            for(int var13 = 0; var13 < var6; ++var13) {
               this.field1467[var13] = field1469[var13];
               this.field1479[var13] = field1463[var13];
               this.field1464[var13] = field1465[var13];
               this.field1466[var13] = field1477[var13];
               this.field1478[var13] = field1474[var13];
               this.field1471[var13] = field1472[var13];
            }

         }
      } catch (Exception var14) {
         this.field1470 = 0;
         this.field1475 = false;
         this.field1476 = false;
      }
   }
}
