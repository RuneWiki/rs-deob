import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class61 extends class549 {
   @OriginalMember(
      owner = "client!tja",
      name = "t",
      descriptor = "I"
   )
   private int field782;
   @OriginalMember(
      owner = "client!tja",
      name = "x",
      descriptor = "I"
   )
   private int field780;
   @OriginalMember(
      owner = "client!tja",
      name = "l",
      descriptor = "I"
   )
   private int field781;
   @OriginalMember(
      owner = "client!tja",
      name = "v",
      descriptor = "I"
   )
   private int field785;
   @OriginalMember(
      owner = "client!tja",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field795 = new String[]{method474(method473("[ N\u001b\u000b\u0007")), method474(method473("A?CY")), method474(method473("[ N\u001b\u0004\u0007")), method474(method473("Td\u0001\u001b?")), method474(method473("[ N\u001b\n\u0007")), method474(method473("[ N\u001b~F$FA|\u0007")), method474(method473("[ N\u001b\u0005\u0007")), method474(method473("[ N\u001b\u0007\u0007"))};
   @OriginalMember(
      owner = "client!tja",
      name = "p",
      descriptor = "I"
   )
   private int field779;
   @OriginalMember(
      owner = "client!tja",
      name = "m",
      descriptor = "I"
   )
   public static int field783;
   @OriginalMember(
      owner = "client!tja",
      name = "o",
      descriptor = "I"
   )
   public static int field784;
   @OriginalMember(
      owner = "client!tja",
      name = "A",
      descriptor = "I"
   )
   public static int field786;
   @OriginalMember(
      owner = "client!tja",
      name = "r",
      descriptor = "I"
   )
   public static int field788;
   @OriginalMember(
      owner = "client!tja",
      name = "w",
      descriptor = "I"
   )
   private int field789;
   @OriginalMember(
      owner = "client!tja",
      name = "n",
      descriptor = "I"
   )
   private int field790;
   @OriginalMember(
      owner = "client!tja",
      name = "y",
      descriptor = "I"
   )
   public static int field792;
   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "I"
   )
   public static int field793;
   @OriginalMember(
      owner = "client!tja",
      name = "s",
      descriptor = "I"
   )
   private int field794;
   @OriginalMember(
      owner = "client!tja",
      name = "q",
      descriptor = "J"
   )
   public static long field791;
   @OriginalMember(
      owner = "client!tja",
      name = "u",
      descriptor = "[B"
   )
   private byte[] field787;

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method469(int arg0, int arg1, int arg2) {
      try {
         ++field793;
         if (arg1 == -256) {
            if (arg0 == 0) {
               this.field794 = -(~arg2 <= -1 ? arg2 : -arg2) + this.field782;
               this.field790 = 4096;
               this.field794 = this.field794 * this.field794 >> 12;
               this.field779 = this.field794;
            } else {
               label35: {
                  this.field790 = this.field794 * this.field780 >> 12;
                  this.field794 = this.field782 + -(arg2 >= 0 ? arg2 : -arg2);
                  if (~this.field790 <= -1) {
                     if (~this.field790 >= -4097) {
                        break label35;
                     }

                     this.field790 = 4096;
                     if (!client.field1786) {
                        break label35;
                     }
                  }

                  this.field790 = 0;
               }

               this.field794 = this.field794 * this.field794 >> 12;
               this.field794 = this.field794 * this.field790 >> 12;
               this.field779 += this.field794 * this.field785 >> 12;
               this.field785 = this.field785 * this.field781 >> 12;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field795[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method470(int arg0) {
      try {
         this.field789 = 0;
         ++field792;
         this.field779 = 0;
         if (arg0 != -273) {
            this.method470(-105);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field795[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method471(boolean arg0) {
      try {
         this.field779 >>= 4;
         if (!arg0) {
            this.field785 = 59;
         }

         label23: {
            this.field785 = this.field781;
            ++field786;
            if (this.field779 >= 0) {
               if (~this.field779 >= -256) {
                  break label23;
               }

               this.field779 = 255;
               if (!client.field1786) {
                  break label23;
               }
            }

            this.field779 = 0;
         }

         this.method354((byte)this.field779, this.field789++, -11617);
         this.field779 = 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field795[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "<init>",
      descriptor = "(IIIIIFFF)V"
   )
   public class61(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field782 = (int)(arg6 * 4096.0F);
         this.field780 = (int)(arg7 * 4096.0F);
         this.field785 = this.field781 = (int)(Math.pow(0.5D, (double)(-arg5)) * 4096.0D);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field795[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(BII)V"
   )
   public void method354(byte arg0, int arg1, int arg2) {
      try {
         ++field783;
         this.field787[arg1] = arg0;
         if (arg2 != -11617) {
            this.field780 = 57;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field795[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(I[I[B[[BI[[B[IB)I"
   )
   public static final int method472(int arg0, int[] arg1, byte[] arg2, byte[][] arg3, int arg4, byte[][] arg5, int[] arg6, byte arg7) {
      boolean var8 = client.field1786;

      try {
         ++field784;
         int var9 = arg6[arg0];
         int var10 = arg1[arg0] + var9;
         int var11 = arg6[arg4];
         if (arg7 <= 126) {
            method472(-28, (int[])null, (byte[])null, (byte[][])null, 6, (byte[][])null, (int[])null, (byte)55);
         }

         int var12 = arg1[arg4] + var11;
         int var13 = var9;
         if (~var11 < ~var9) {
            var13 = var11;
         }

         int var14 = var10;
         if (var12 < var10) {
            var14 = var12;
         }

         int var15 = arg2[arg0] & 255;
         if (var15 > (arg2[arg4] & 255)) {
            var15 = arg2[arg4] & 255;
         }

         byte[] var16 = arg5[arg0];
         byte[] var17 = arg3[arg4];
         int var18 = -var9 + var13;
         int var19 = -var11 + var13;
         int var20 = var13;
         int var21;
         if (var8) {
            var21 = var17[var19++] + var16[var18++];
            if (var15 > var21) {
               var15 = var21;
            }

            var20 = var13 + 1;
         }

         while(true) {
            while(var14 > var20) {
               var21 = var17[var19++] + var16[var18++];
               if (var15 > var21) {
                  var15 = var21;
               }

               ++var20;
            }

            int var24 = -var15;
            if (!var8) {
               return var24;
            }

            var21 = var24;
            if (var15 > var21) {
               var15 = var21;
            }

            ++var20;
         }
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field795[2] + arg0 + ',' + (arg1 != null ? field795[3] : field795[1]) + ',' + (arg2 != null ? field795[3] : field795[1]) + ',' + (arg3 != null ? field795[3] : field795[1]) + ',' + arg4 + ',' + (arg5 != null ? field795[3] : field795[1]) + ',' + (arg6 != null ? field795[3] : field795[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method473(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method474(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
