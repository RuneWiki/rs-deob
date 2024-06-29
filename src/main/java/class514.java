import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class514 {
   @OriginalMember(
      owner = "client!cka",
      name = "g",
      descriptor = "Z"
   )
   public boolean field7293 = false;
   @OriginalMember(
      owner = "client!cka",
      name = "f",
      descriptor = "Z"
   )
   public boolean field7290 = false;
   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "I"
   )
   public int field7294 = 0;
   @OriginalMember(
      owner = "client!cka",
      name = "k",
      descriptor = "Z"
   )
   public boolean field7301 = false;
   @OriginalMember(
      owner = "client!cka",
      name = "l",
      descriptor = "Lao;"
   )
   public class626 field7302 = null;
   @OriginalMember(
      owner = "client!cka",
      name = "q",
      descriptor = "[S"
   )
   public short[] field7305;
   @OriginalMember(
      owner = "client!cka",
      name = "c",
      descriptor = "[S"
   )
   public short[] field7296;
   @OriginalMember(
      owner = "client!cka",
      name = "p",
      descriptor = "[S"
   )
   public short[] field7295;
   @OriginalMember(
      owner = "client!cka",
      name = "d",
      descriptor = "[S"
   )
   public short[] field7292;
   @OriginalMember(
      owner = "client!cka",
      name = "i",
      descriptor = "[S"
   )
   public short[] field7298;
   @OriginalMember(
      owner = "client!cka",
      name = "o",
      descriptor = "[B"
   )
   public byte[] field7300;
   @OriginalMember(
      owner = "client!cka",
      name = "m",
      descriptor = "[S"
   )
   private static short[] field7291 = new short[500];
   @OriginalMember(
      owner = "client!cka",
      name = "n",
      descriptor = "[S"
   )
   private static short[] field7289 = new short[500];
   @OriginalMember(
      owner = "client!cka",
      name = "h",
      descriptor = "[S"
   )
   private static short[] field7299 = new short[500];
   @OriginalMember(
      owner = "client!cka",
      name = "b",
      descriptor = "[B"
   )
   private static byte[] field7297 = new byte[500];
   @OriginalMember(
      owner = "client!cka",
      name = "e",
      descriptor = "[S"
   )
   private static short[] field7303 = new short[500];
   @OriginalMember(
      owner = "client!cka",
      name = "j",
      descriptor = "[S"
   )
   private static short[] field7304 = new short[500];

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "()V"
   )
   public static void method3868() {
      field7304 = null;
      field7303 = null;
      field7291 = null;
      field7289 = null;
      field7299 = null;
      field7297 = null;
   }

   @OriginalMember(
      owner = "client!cka",
      name = "<init>",
      descriptor = "([BLao;)V"
   )
   public class514(byte[] arg0, class626 arg1) {
      this.field7302 = arg1;

      try {
         class65 var3 = new class65(arg0);
         class65 var4 = new class65(arg0);
         var3.method665(false);
         var3.field945 += 2;
         int var5 = var3.method665(false);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field945 = var3.field945 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field7302.field8943[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method665(false);
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field7304[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field7303[var6] = (short)var4.method646((byte)48);
               } else {
                  field7303[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field7291[var6] = (short)var4.method646((byte)122);
               } else {
                  field7291[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field7289[var6] = (short)var4.method646((byte)107);
               } else {
                  field7289[var6] = var12;
               }

               field7297[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field7303[var6] = (short)(field7303[var6] << 2 & 16383);
                  field7291[var6] = (short)(field7291[var6] << 2 & 16383);
                  field7289[var6] = (short)(field7289[var6] << 2 & 16383);
               }

               field7299[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field7301 = true;
                  } else if (var10 == 7) {
                     this.field7293 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field7290 = true;
                  }
               } else if (var7 > var8) {
                  field7299[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (arg0.length != var4.field945) {
            throw new RuntimeException();
         } else {
            this.field7294 = var6;
            this.field7305 = new short[var6];
            this.field7296 = new short[var6];
            this.field7295 = new short[var6];
            this.field7292 = new short[var6];
            this.field7298 = new short[var6];
            this.field7300 = new byte[var6];

            for(int var13 = 0; var13 < var6; ++var13) {
               this.field7305[var13] = field7304[var13];
               this.field7296[var13] = field7303[var13];
               this.field7295[var13] = field7291[var13];
               this.field7292[var13] = field7289[var13];
               this.field7298[var13] = field7299[var13];
               this.field7300[var13] = field7297[var13];
            }

         }
      } catch (Exception var14) {
         this.field7294 = 0;
         this.field7301 = false;
         this.field7293 = false;
      }
   }
}
