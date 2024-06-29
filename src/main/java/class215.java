import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class215 {
   @OriginalMember(
      owner = "client!dt",
      name = "f",
      descriptor = "Z"
   )
   public boolean field3257 = false;
   @OriginalMember(
      owner = "client!dt",
      name = "e",
      descriptor = "I"
   )
   public int field3260 = 0;
   @OriginalMember(
      owner = "client!dt",
      name = "c",
      descriptor = "Z"
   )
   public boolean field3262 = false;
   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "Loha;"
   )
   public class472 field3268 = null;
   @OriginalMember(
      owner = "client!dt",
      name = "q",
      descriptor = "Z"
   )
   public boolean field3271 = false;
   @OriginalMember(
      owner = "client!dt",
      name = "j",
      descriptor = "[S"
   )
   public short[] field3265;
   @OriginalMember(
      owner = "client!dt",
      name = "p",
      descriptor = "[S"
   )
   public short[] field3272;
   @OriginalMember(
      owner = "client!dt",
      name = "n",
      descriptor = "[S"
   )
   public short[] field3270;
   @OriginalMember(
      owner = "client!dt",
      name = "d",
      descriptor = "[S"
   )
   public short[] field3263;
   @OriginalMember(
      owner = "client!dt",
      name = "m",
      descriptor = "[S"
   )
   public short[] field3258;
   @OriginalMember(
      owner = "client!dt",
      name = "g",
      descriptor = "[B"
   )
   public byte[] field3264;
   @OriginalMember(
      owner = "client!dt",
      name = "l",
      descriptor = "[B"
   )
   private static byte[] field3256 = new byte[500];
   @OriginalMember(
      owner = "client!dt",
      name = "b",
      descriptor = "[S"
   )
   private static short[] field3266 = new short[500];
   @OriginalMember(
      owner = "client!dt",
      name = "i",
      descriptor = "[S"
   )
   private static short[] field3261 = new short[500];
   @OriginalMember(
      owner = "client!dt",
      name = "h",
      descriptor = "[S"
   )
   private static short[] field3259 = new short[500];
   @OriginalMember(
      owner = "client!dt",
      name = "k",
      descriptor = "[S"
   )
   private static short[] field3269 = new short[500];
   @OriginalMember(
      owner = "client!dt",
      name = "o",
      descriptor = "[S"
   )
   private static short[] field3267 = new short[500];

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "([BLoha;)V",
      line = 59
   )
   public class215(byte[] arg0, class472 arg1) {
      this.field3268 = arg1;

      try {
         class354 var3 = new class354(arg0);
         class354 var4 = new class354(arg0);
         var3.method2855(-31007);
         var3.field5436 += 2;
         int var5 = var3.method2855(-31007);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field5436 = var3.field5436 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field3268.field7182[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method2855(-31007);
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field3261[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field3269[var6] = (short)var4.method2881(-108);
               } else {
                  field3269[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field3259[var6] = (short)var4.method2881(72);
               } else {
                  field3259[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field3267[var6] = (short)var4.method2881(-98);
               } else {
                  field3267[var6] = var12;
               }

               field3256[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field3269[var6] = (short)(field3269[var6] << 2 & 16383);
                  field3259[var6] = (short)(field3259[var6] << 2 & 16383);
                  field3267[var6] = (short)(field3267[var6] << 2 & 16383);
               }

               field3266[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field3262 = true;
                  } else if (var10 == 7) {
                     this.field3271 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field3257 = true;
                  }
               } else if (var7 > var8) {
                  field3266[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (arg0.length != var4.field5436) {
            throw new RuntimeException();
         } else {
            this.field3260 = var6;
            this.field3265 = new short[var6];
            this.field3272 = new short[var6];
            this.field3270 = new short[var6];
            this.field3263 = new short[var6];
            this.field3258 = new short[var6];
            this.field3264 = new byte[var6];

            for(int var13 = 0; var13 < var6; ++var13) {
               this.field3265[var13] = field3261[var13];
               this.field3272[var13] = field3269[var13];
               this.field3270[var13] = field3259[var13];
               this.field3263[var13] = field3267[var13];
               this.field3258[var13] = field3266[var13];
               this.field3264[var13] = field3256[var13];
            }

         }
      } catch (Exception var14) {
         this.field3260 = 0;
         this.field3262 = false;
         this.field3271 = false;
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "()V",
      line = 16
   )
   public static void method1870() {
      field3261 = null;
      field3269 = null;
      field3259 = null;
      field3267 = null;
      field3266 = null;
      field3256 = null;
   }
}
