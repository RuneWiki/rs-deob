import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class283 extends class70 {
   @OriginalMember(
      owner = "client!bl",
      name = "I",
      descriptor = "I"
   )
   private int field4479 = 32768;
   @OriginalMember(
      owner = "client!bl",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4483 = new String[]{method2366(method2365("e\u001bUZj")), method2366(method2365("i\u0002\u0017u")), method2366(method2365("|YU7?")), method2366(method2365("e\u001bUXj")), method2366(method2365("e\u001bUSj")), method2366(method2365("e\u001bUQj")), method2366(method2365("e\u001bU[j"))};
   @OriginalMember(
      owner = "client!bl",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field4478 = false;
   @OriginalMember(
      owner = "client!bl",
      name = "G",
      descriptor = "I"
   )
   public static int field4476;
   @OriginalMember(
      owner = "client!bl",
      name = "K",
      descriptor = "I"
   )
   public static int field4477;
   @OriginalMember(
      owner = "client!bl",
      name = "L",
      descriptor = "I"
   )
   public static int field4480;
   @OriginalMember(
      owner = "client!bl",
      name = "J",
      descriptor = "I"
   )
   public static int field4481;
   @OriginalMember(
      owner = "client!bl",
      name = "H",
      descriptor = "I"
   )
   public static int field4482;

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method2364(class610 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         class743 var3 = (class743)class580.field8572.method1815(1);
         if (var2) {
            if (var3.field11046) {
               var3.method5457(arg0);
            }

            var3 = (class743)class580.field8572.method1817(0);
         }

         while(true) {
            int var10000;
            if (var3 == null) {
               var10000 = arg1;
               if (!var2) {
                  if (arg1 <= 72) {
                     method2364((class610)null, -75);
                  }

                  ++field4482;
                  return;
               }
            } else {
               var10000 = var3.field11046;
            }

            if (var10000 != 0) {
               var3.method5457(arg0);
            }

            var3 = (class743)class580.field8572.method1817(0);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4483[3] + (arg0 != null ? field4483[2] : field4483[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4480;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int[] var5 = this.method545(1, arg1, (byte)-96);
            int[] var6 = this.method545(2, arg1, (byte)-69);
            int var7 = 0;
            if (var3 || ~class678.field10127 < ~var7) {
               do {
                  int var8 = var5[var7] >> 4 & 255;
                  int var9 = var6[var7] * this.field4479 >> 12;
                  int var10 = class594.field8746[var8] * var9 >> 12;
                  int var11 = class143.field2034[var8] * var9 >> 12;
                  int var12 = class50.field637 & var7 - -(var10 >> 12);
                  int var13 = class578.field8547 & arg1 - -(var11 >> 12);
                  int[] var14 = this.method545(0, var13, (byte)-76);
                  var4[var7] = var14[var12];
                  ++var7;
               } while(~class678.field10127 < ~var7);
            }
         }

         if (arg0 != 87) {
            field4478 = false;
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field4483[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4481;
         int[][] var4 = super.field918.method3276((byte)106, arg1);
         if (arg0 != 32) {
            this.method274(40, -44, (class354)null);
         }

         if (super.field918.field6361) {
            int[] var5 = this.method545(1, arg1, (byte)-64);
            int[] var6 = this.method545(2, arg1, (byte)-113);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int var10 = 0;
            if (var3 || var10 < class678.field10127) {
               do {
                  int var11 = 255 & var5[var10] * 255 >> 12;
                  int var12 = var6[var10] * this.field4479 >> 12;
                  int var13 = class594.field8746[var11] * var12 >> 12;
                  int var14 = class143.field2034[var11] * var12 >> 12;
                  int var15 = (var13 >> 12) + var10 & class50.field637;
                  int var16 = class578.field8547 & arg1 - -(var14 >> 12);
                  int[][] var17 = this.method539(true, var16, 0);
                  var7[var10] = var17[0][var15];
                  var8[var10] = var17[1][var15];
                  var9[var10] = var17[2][var15];
                  ++var10;
               } while(var10 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field4483[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "<init>",
      descriptor = "()V"
   )
   public class283() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label48: {
            label42: {
               ++field4476;
               if (arg1 != 0) {
                  if (~arg1 != -2) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field4479 = arg2.method2848(-107) << 4;
               if (!var4) {
                  break label48;
               }
            }

            super.field933 = ~arg2.method2855(-31007) == -2;
         }

         if (arg0 != -1) {
            this.field4479 = 0;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4483[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4483[2] : field4483[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method275(boolean arg0) {
      try {
         if (arg0) {
            field4478 = true;
         }

         class452.method3548((byte)-119);
         ++field4477;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4483[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2365(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2366(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
