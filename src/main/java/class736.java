import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class736 extends class347 {
   @OriginalMember(
      owner = "client!ki",
      name = "p",
      descriptor = "I"
   )
   public int field10928 = 0;
   @OriginalMember(
      owner = "client!ki",
      name = "u",
      descriptor = "Z"
   )
   private boolean field10924 = true;
   @OriginalMember(
      owner = "client!ki",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   public String field10929 = null;
   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10936 = new String[]{method5357(method5356("$Ul^z")), method5357(method5356("1\u000e.\u001c")), method5357(method5356("4\u0012l3/")), method5357(method5356("4\u0012l6/")), method5357(method5356("4\u0012l5/")), method5357(method5356("4\u0012l2/")), method5357(method5356("4\u0012l4/")), method5357(method5356("4\u0012l1/")), method5357(method5356("4\u0012lLn1\u00126N/"))};
   @OriginalMember(
      owner = "client!ki",
      name = "i",
      descriptor = "B"
   )
   public byte field10926;
   @OriginalMember(
      owner = "client!ki",
      name = "r",
      descriptor = "B"
   )
   public byte field10930;
   @OriginalMember(
      owner = "client!ki",
      name = "o",
      descriptor = "I"
   )
   public static int field10921;
   @OriginalMember(
      owner = "client!ki",
      name = "q",
      descriptor = "I"
   )
   public static int field10922;
   @OriginalMember(
      owner = "client!ki",
      name = "v",
      descriptor = "I"
   )
   public static int field10923;
   @OriginalMember(
      owner = "client!ki",
      name = "l",
      descriptor = "I"
   )
   public static int field10927;
   @OriginalMember(
      owner = "client!ki",
      name = "j",
      descriptor = "I"
   )
   public static int field10931;
   @OriginalMember(
      owner = "client!ki",
      name = "m",
      descriptor = "I"
   )
   public static int field10933;
   @OriginalMember(
      owner = "client!ki",
      name = "w",
      descriptor = "J"
   )
   public long field10934;
   @OriginalMember(
      owner = "client!ki",
      name = "n",
      descriptor = "Z"
   )
   private boolean field10925;
   @OriginalMember(
      owner = "client!ki",
      name = "t",
      descriptor = "[I"
   )
   private int[] field10935;
   @OriginalMember(
      owner = "client!ki",
      name = "k",
      descriptor = "[Lju;"
   )
   public class135[] field10932;

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method5350(int arg0) {
      int var2 = client.field4530;

      try {
         if (this.field10935 == null) {
            String[] var3 = new String[this.field10928];
            this.field10935 = new int[this.field10928];
            int var4 = 0;
            if (var2 != 0) {
               var3[var4] = this.field10932[var4].field1724;
               this.field10935[var4] = var4++;
            }

            while(true) {
               while(var4 < this.field10928) {
                  var3[var4] = this.field10932[var4].field1724;
                  this.field10935[var4] = var4++;
               }

               int[] var10000 = this.field10935;
               if (var2 == 0) {
                  class347.method2717(var10000, (byte)-110, var3);
                  break;
               }

               var10000[-110] = var4++;
            }
         }

         ++field10921;
         if (arg0 != -101) {
            this.method5352((class135)null, 51);
         }

         return this.field10935;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10936[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)I"
   )
   public final int method5351(String arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         ++field10922;
         int var4 = 0;
         if (var3 != 0) {
            if (this.field10932[var4].field1724.equalsIgnoreCase(arg0)) {
               return var4;
            }

            ++var4;
         }

         while(true) {
            while(~var4 > ~this.field10928) {
               if (this.field10932[var4].field1724.equalsIgnoreCase(arg0)) {
                  return var4;
               }

               ++var4;
            }

            if (var3 == 0) {
               if (!arg1) {
                  return -12;
               }

               return -1;
            }

            if (arg1) {
               return var4;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10936[7] + (arg0 != null ? field10936[0] : field10936[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Lju;I)V"
   )
   public final void method5352(class135 arg0, int arg1) {
      try {
         ++field10923;
         if (arg1 == -1) {
            if (this.field10932 == null || ~this.field10928 <= ~this.field10932.length) {
               this.method5353(this.field10928 - -5, -80);
            }

            this.field10932[this.field10928++] = arg0;
            this.field10935 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10936[5] + (arg0 != null ? field10936[0] : field10936[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method5353(int arg0, int arg1) {
      try {
         if (arg1 < -4) {
            ++field10931;
            if (this.field10932 != null) {
               class195.method1496(this.field10932, 0, this.field10932 = new class135[arg0], 0, this.field10928);
            } else {
               this.field10932 = new class135[arg0];
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10936[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5354(int arg0, int arg1) {
      try {
         ++field10933;
         --this.field10928;
         if (arg0 > -53) {
            this.field10935 = null;
         }

         label19: {
            if (~this.field10928 != -1) {
               class195.method1496(this.field10932, arg1 + 1, this.field10932, arg1, -arg1 + this.field10928);
               if (client.field4530 == 0) {
                  break label19;
               }
            }

            this.field10932 = null;
         }

         this.field10935 = null;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10936[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Ljj;B)V"
   )
   private final void method5355(class128 arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field10927;
         int var4 = arg0.method1104(255);
         if (~(1 & var4) != -1) {
            this.field10925 = true;
         }

         if ((var4 & 2) != 0) {
            this.field10924 = true;
         }

         super.field5280 = arg0.method1063(arg1 ^ 17);
         this.field10934 = arg0.method1063(121);
         this.field10929 = arg0.method1083((byte)121);
         arg0.method1104(255);
         this.field10930 = arg0.method1047((byte)22);
         if (arg1 != 112) {
            this.field10934 = -42L;
         }

         this.field10926 = arg0.method1047((byte)58);
         this.field10928 = arg0.method1038((byte)-121);
         if (~this.field10928 < -1) {
            this.field10932 = new class135[this.field10928];
            int var5 = 0;
            if (var3 != 0 || var5 < this.field10928) {
               do {
                  class135 var6 = new class135();
                  if (this.field10925) {
                     arg0.method1063(107);
                  }

                  if (this.field10924) {
                     var6.field1724 = arg0.method1083((byte)119);
                  }

                  var6.field1722 = arg0.method1047((byte)63);
                  var6.field1723 = arg0.method1038((byte)-101);
                  this.field10932[var5] = var6;
                  ++var5;
               } while(var5 < this.field10928);

            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10936[2] + (arg0 != null ? field10936[0] : field10936[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "<init>",
      descriptor = "(Ljj;)V"
   )
   public class736(class128 arg0) {
      try {
         this.method5355(arg0, (byte)112);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10936[8] + (arg0 != null ? field10936[0] : field10936[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5356(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5357(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
