import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class451 {
   @OriginalMember(
      owner = "client!vk",
      name = "e",
      descriptor = "Ler;"
   )
   public class235 field6110 = null;
   @OriginalMember(
      owner = "client!vk",
      name = "h",
      descriptor = "Z"
   )
   public boolean field6115 = false;
   @OriginalMember(
      owner = "client!vk",
      name = "d",
      descriptor = "I"
   )
   public int field6113 = 0;
   @OriginalMember(
      owner = "client!vk",
      name = "n",
      descriptor = "Z"
   )
   public boolean field6117 = false;
   @OriginalMember(
      owner = "client!vk",
      name = "p",
      descriptor = "Z"
   )
   public boolean field6122 = false;
   @OriginalMember(
      owner = "client!vk",
      name = "j",
      descriptor = "[S"
   )
   public short[] field6112;
   @OriginalMember(
      owner = "client!vk",
      name = "b",
      descriptor = "[S"
   )
   public short[] field6124;
   @OriginalMember(
      owner = "client!vk",
      name = "o",
      descriptor = "[S"
   )
   public short[] field6109;
   @OriginalMember(
      owner = "client!vk",
      name = "g",
      descriptor = "[S"
   )
   public short[] field6108;
   @OriginalMember(
      owner = "client!vk",
      name = "i",
      descriptor = "[S"
   )
   public short[] field6116;
   @OriginalMember(
      owner = "client!vk",
      name = "l",
      descriptor = "[B"
   )
   public byte[] field6120;
   @OriginalMember(
      owner = "client!vk",
      name = "f",
      descriptor = "[S"
   )
   private static short[] field6118 = new short[500];
   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field6111 = new short[500];
   @OriginalMember(
      owner = "client!vk",
      name = "k",
      descriptor = "[S"
   )
   private static short[] field6114 = new short[500];
   @OriginalMember(
      owner = "client!vk",
      name = "q",
      descriptor = "[B"
   )
   private static byte[] field6123 = new byte[500];
   @OriginalMember(
      owner = "client!vk",
      name = "m",
      descriptor = "[S"
   )
   private static short[] field6121 = new short[500];
   @OriginalMember(
      owner = "client!vk",
      name = "c",
      descriptor = "[S"
   )
   private static short[] field6119 = new short[500];

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "()V"
   )
   public static void method3454() {
      field6111 = null;
      field6121 = null;
      field6114 = null;
      field6118 = null;
      field6119 = null;
      field6123 = null;
   }

   @OriginalMember(
      owner = "client!vk",
      name = "<init>",
      descriptor = "([BLer;)V"
   )
   public class451(byte[] arg0, class235 arg1) {
      this.field6110 = arg1;

      try {
         class66 var3 = new class66(arg0);
         class66 var4 = new class66(arg0);
         var3.method640(255);
         var3.field864 += 2;
         int var5 = var3.method640(255);
         int var6 = 0;
         int var7 = -1;
         int var8 = -1;
         var4.field864 = var3.field864 + var5;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10 = this.field6110.field2953[var9];
            if (var10 == 0) {
               var7 = var9;
            }

            int var11 = var3.method640(255);
            if (var11 > 0) {
               if (var10 == 0) {
                  var8 = var9;
               }

               field6111[var6] = (short)var9;
               short var12 = 0;
               if (var10 == 3 || var10 == 10) {
                  var12 = 128;
               }

               if ((var11 & 1) != 0) {
                  field6121[var6] = (short)var4.method623(-49152);
               } else {
                  field6121[var6] = var12;
               }

               if ((var11 & 2) != 0) {
                  field6114[var6] = (short)var4.method623(-49152);
               } else {
                  field6114[var6] = var12;
               }

               if ((var11 & 4) != 0) {
                  field6118[var6] = (short)var4.method623(-49152);
               } else {
                  field6118[var6] = var12;
               }

               field6123[var6] = (byte)(var11 >>> 3 & 3);
               if (var10 == 2 || var10 == 9) {
                  field6121[var6] = (short)(field6121[var6] << 2 & 16383);
                  field6114[var6] = (short)(field6114[var6] << 2 & 16383);
                  field6118[var6] = (short)(field6118[var6] << 2 & 16383);
               }

               field6119[var6] = -1;
               if (var10 != 1 && var10 != 2 && var10 != 3) {
                  if (var10 == 5) {
                     this.field6122 = true;
                  } else if (var10 == 7) {
                     this.field6117 = true;
                  } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                     this.field6115 = true;
                  }
               } else if (var7 > var8) {
                  field6119[var6] = (short)var7;
                  var8 = var7;
               }

               ++var6;
            }
         }

         if (arg0.length != var4.field864) {
            throw new RuntimeException();
         } else {
            this.field6113 = var6;
            this.field6112 = new short[var6];
            this.field6124 = new short[var6];
            this.field6109 = new short[var6];
            this.field6108 = new short[var6];
            this.field6116 = new short[var6];
            this.field6120 = new byte[var6];

            for(int var13 = 0; var13 < var6; ++var13) {
               this.field6112[var13] = field6111[var13];
               this.field6124[var13] = field6121[var13];
               this.field6109[var13] = field6114[var13];
               this.field6108[var13] = field6118[var13];
               this.field6116[var13] = field6119[var13];
               this.field6120[var13] = field6123[var13];
            }

         }
      } catch (Exception var14) {
         this.field6113 = 0;
         this.field6122 = false;
         this.field6117 = false;
      }
   }
}
