import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class550 {
   @OriginalMember(
      owner = "client!lh",
      name = "j",
      descriptor = "[I"
   )
   private int[] field7937 = new int[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7948 = new String[]{method4104(method4103("),I&F")), method4104(method4103("),I'F")), method4104(method4103("),I\"F")), method4104(method4103("),I!F")), method4104(method4103("),I#F")), method4104(method4103("+1\u000b\t")), method4104(method4103("),I$F")), method4104(method4103(">jIK\u0013")), method4104(method4103("),I F"))};
   @OriginalMember(
      owner = "client!lh",
      name = "f",
      descriptor = "I"
   )
   public static int field7947 = 0;
   @OriginalMember(
      owner = "client!lh",
      name = "k",
      descriptor = "I"
   )
   public static int field7932;
   @OriginalMember(
      owner = "client!lh",
      name = "p",
      descriptor = "I"
   )
   public static int field7933;
   @OriginalMember(
      owner = "client!lh",
      name = "m",
      descriptor = "I"
   )
   public static int field7934;
   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "I"
   )
   public static int field7936;
   @OriginalMember(
      owner = "client!lh",
      name = "e",
      descriptor = "I"
   )
   public static int field7938;
   @OriginalMember(
      owner = "client!lh",
      name = "o",
      descriptor = "I"
   )
   public static int field7942;
   @OriginalMember(
      owner = "client!lh",
      name = "g",
      descriptor = "I"
   )
   public static int field7946;
   @OriginalMember(
      owner = "client!lh",
      name = "h",
      descriptor = "Lbm;"
   )
   public class123 field7939;
   @OriginalMember(
      owner = "client!lh",
      name = "c",
      descriptor = "Ltq;"
   )
   public static class653 field7940;
   @OriginalMember(
      owner = "client!lh",
      name = "l",
      descriptor = "[I"
   )
   private int[] field7935;
   @OriginalMember(
      owner = "client!lh",
      name = "i",
      descriptor = "[S"
   )
   private short[] field7941;
   @OriginalMember(
      owner = "client!lh",
      name = "d",
      descriptor = "[S"
   )
   private short[] field7943;
   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "[S"
   )
   private short[] field7944;
   @OriginalMember(
      owner = "client!lh",
      name = "n",
      descriptor = "[S"
   )
   private short[] field7945;

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(BLuda;)V",
      line = 9
   )
   public final void method4096(byte arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 > 13) {
            ++field7936;

            do {
               int var4 = arg1.method3564((byte)-115);
               if (~var4 == -1) {
                  break;
               }

               this.method4102(var4, arg1, -30845);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7948[6] + arg0 + ',' + (arg1 != null ? field7948[7] : field7948[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(B)Z",
      line = 32
   )
   public final boolean method4097(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(Z)V",
      line = 71
   )
   public static void method4098(boolean arg0) {
      try {
         if (!arg0) {
            method4098(true);
         }

         field7940 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7948[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "(I)Lph;",
      line = 81
   )
   public final class668 method4099(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(I)Z",
      line = 149
   )
   public final boolean method4100(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lh",
      name = "b",
      descriptor = "(B)Lph;",
      line = 180
   )
   public final class668 method4101(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(ILuda;I)V",
      line = 263
   )
   private final void method4102(int arg0, class473 arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label137: {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  if (arg0 == 3) {
                     break label137;
                  }

                  if (arg0 != 40) {
                     if (~arg0 != -42) {
                        if (arg0 < 60 || arg0 >= 70) {
                           break label137;
                        }

                        this.field7937[arg0 + -60] = arg1.method3565(true);
                        if (!var4) {
                           break label137;
                        }
                     }

                     int var5 = arg1.method3564((byte)-79);
                     this.field7945 = new short[var5];
                     this.field7941 = new short[var5];
                     int var6 = 0;
                     if (var4) {
                        this.field7941[var6] = (short)arg1.method3565(true);
                        this.field7945[var6] = (short)arg1.method3565(true);
                        ++var6;
                     }

                     while(true) {
                        while(~var5 < ~var6) {
                           this.field7941[var6] = (short)arg1.method3565(true);
                           this.field7945[var6] = (short)arg1.method3565(true);
                           ++var6;
                        }

                        if (!var4) {
                           if (!var4) {
                              break label137;
                           }
                           break;
                        }

                        ++var6;
                     }
                  }

                  int var7 = arg1.method3564((byte)-98);
                  this.field7944 = new short[var7];
                  this.field7943 = new short[var7];
                  int var8 = 0;
                  if (var4) {
                     this.field7944[var8] = (short)arg1.method3565(true);
                     this.field7943[var8] = (short)arg1.method3565(true);
                     ++var8;
                  }

                  while(true) {
                     while(~var7 < ~var8) {
                        this.field7944[var8] = (short)arg1.method3565(true);
                        this.field7943[var8] = (short)arg1.method3565(true);
                        ++var8;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label137;
                        }
                        break;
                     }

                     ++var8;
                  }
               }

               int var9 = arg1.method3564((byte)-97);
               this.field7935 = new int[var9];
               int var10 = 0;
               if (var4) {
                  this.field7935[var10] = arg1.method3565(true);
                  ++var10;
               }

               while(true) {
                  while(~var9 < ~var10) {
                     this.field7935[var10] = arg1.method3565(true);
                     ++var10;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label137;
                     }
                     break;
                  }

                  ++var10;
               }
            }

            arg1.method3564((byte)-111);
         }

         ++field7934;
         if (arg2 != -30845) {
            this.method4101((byte)-46);
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field7948[8] + arg0 + ',' + (arg1 != null ? field7948[7] : field7948[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4103(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4104(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
