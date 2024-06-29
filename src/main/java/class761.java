import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class761 {
   @OriginalMember(
      owner = "client!sha",
      name = "f",
      descriptor = "Z"
   )
   public boolean field11009 = false;
   @OriginalMember(
      owner = "client!sha",
      name = "d",
      descriptor = "I"
   )
   public int field11016 = 0;
   @OriginalMember(
      owner = "client!sha",
      name = "h",
      descriptor = "Z"
   )
   public boolean field11014 = false;
   @OriginalMember(
      owner = "client!sha",
      name = "j",
      descriptor = "Lfl;"
   )
   public class773 field11007 = null;
   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "Z"
   )
   public boolean field11015 = false;
   @OriginalMember(
      owner = "client!sha",
      name = "q",
      descriptor = "[S"
   )
   public short[] field11011;
   @OriginalMember(
      owner = "client!sha",
      name = "g",
      descriptor = "[S"
   )
   public short[] field11013;
   @OriginalMember(
      owner = "client!sha",
      name = "m",
      descriptor = "[S"
   )
   public short[] field11012;
   @OriginalMember(
      owner = "client!sha",
      name = "i",
      descriptor = "[S"
   )
   public short[] field11002;
   @OriginalMember(
      owner = "client!sha",
      name = "p",
      descriptor = "[S"
   )
   public short[] field11004;
   @OriginalMember(
      owner = "client!sha",
      name = "c",
      descriptor = "[B"
   )
   public byte[] field11001;
   @OriginalMember(
      owner = "client!sha",
      name = "n",
      descriptor = "[S"
   )
   private static short[] field11010 = new short[500];
   @OriginalMember(
      owner = "client!sha",
      name = "b",
      descriptor = "[S"
   )
   private static short[] field11006 = new short[500];
   @OriginalMember(
      owner = "client!sha",
      name = "o",
      descriptor = "[S"
   )
   private static short[] field11003 = new short[500];
   @OriginalMember(
      owner = "client!sha",
      name = "e",
      descriptor = "[B"
   )
   private static byte[] field11005 = new byte[500];
   @OriginalMember(
      owner = "client!sha",
      name = "k",
      descriptor = "[S"
   )
   private static short[] field11008 = new short[500];
   @OriginalMember(
      owner = "client!sha",
      name = "l",
      descriptor = "[S"
   )
   private static short[] field11017 = new short[500];

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "()V"
   )
   public static void method5470() {
      field11006 = null;
      field11017 = null;
      field11008 = null;
      field11010 = null;
      field11003 = null;
      field11005 = null;
   }

   @OriginalMember(
      owner = "client!sha",
      name = "<init>",
      descriptor = "([BLfl;)V"
   )
   public class761(byte[] arg0, class773 arg1) {
      this.field11007 = arg1;

      try {
         class594 var3 = new class594(arg0);
         class594 var4 = new class594(arg0);
         var3.method4288((byte)106);
         var3.field8243 += 2;
         int var5 = var3.method4288((byte)61);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field8243 = var3.field8243 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field11007.field11155[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method4288((byte)87);
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field11006[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field11017[var6] = (short)var4.method4319(255);
               } else {
                  field11017[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field11008[var6] = (short)var4.method4319(255);
               } else {
                  field11008[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field11010[var6] = (short)var4.method4319(255);
               } else {
                  field11010[var6] = var12;
               }

               field11005[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field11017[var6] = (short)(field11017[var6] << 2 & 16383);
                  field11008[var6] = (short)(field11008[var6] << 2 & 16383);
                  field11010[var6] = (short)(field11010[var6] << 2 & 16383);
               }

               field11003[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field11015 = true;
                  } else if (var10 == 7) {
                     this.field11014 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field11009 = true;
                  }
               } else if (var7 > var8) {
                  field11003[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (arg0.length != var4.field8243) {
            throw new RuntimeException();
         } else {
            this.field11016 = var6;
            this.field11011 = new short[var6];
            this.field11013 = new short[var6];
            this.field11012 = new short[var6];
            this.field11002 = new short[var6];
            this.field11004 = new short[var6];
            this.field11001 = new byte[var6];

            for(int var13 = 0; var13 < var6; ++var13) {
               this.field11011[var13] = field11006[var13];
               this.field11013[var13] = field11017[var13];
               this.field11012[var13] = field11008[var13];
               this.field11002[var13] = field11010[var13];
               this.field11004[var13] = field11003[var13];
               this.field11001[var13] = field11005[var13];
            }

         }
      } catch (Exception var14) {
         this.field11016 = 0;
         this.field11015 = false;
         this.field11014 = false;
      }
   }
}
