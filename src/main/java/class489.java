import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class489 extends class55 {
   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7010 = new String[]{method3559(method3558(".[Eia")), method3559(method3558(".[Eba")), method3559(method3558(".[Eoa")), method3559(method3558(".[Ena")), method3559(method3558(".[Eca")), method3559(method3558(".[Eka")), method3559(method3558(".[Ema")), method3559(method3558(".[Ela")), method3559(method3558(".[Eha"))};
   @OriginalMember(
      owner = "client!vq",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field7003 = new int[32];
   @OriginalMember(
      owner = "client!vq",
      name = "m",
      descriptor = "I"
   )
   public static int field7006 = 1;
   @OriginalMember(
      owner = "client!vq",
      name = "f",
      descriptor = "I"
   )
   public static int field7000;
   @OriginalMember(
      owner = "client!vq",
      name = "h",
      descriptor = "I"
   )
   public static int field7001;
   @OriginalMember(
      owner = "client!vq",
      name = "l",
      descriptor = "I"
   )
   public static int field7002;
   @OriginalMember(
      owner = "client!vq",
      name = "g",
      descriptor = "I"
   )
   public static int field7004;
   @OriginalMember(
      owner = "client!vq",
      name = "n",
      descriptor = "I"
   )
   public static int field7005;
   @OriginalMember(
      owner = "client!vq",
      name = "k",
      descriptor = "I"
   )
   public static int field7007;
   @OriginalMember(
      owner = "client!vq",
      name = "e",
      descriptor = "I"
   )
   public static int field7008;
   @OriginalMember(
      owner = "client!vq",
      name = "j",
      descriptor = "I"
   )
   public static int field7009;

   @OriginalMember(
      owner = "client!vq",
      name = "d",
      descriptor = "(I)V",
      line = 4
   )
   public static void method3553(int arg0) {
      try {
         int var1 = 110 % ((arg0 - -39) / 47);
         field7003 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7010[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "c",
      descriptor = "(I)V",
      line = 13
   )
   public static final void method3554(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field7009;
         if (arg0 != 4652) {
            field7006 = -18;
         }

         class534 var2 = class430.field6150.field105;

         while(true) {
            if (~var2.method3848(class430.field6150.field110, arg0 ^ -4724) <= -16) {
               int var3 = var2.method3844(15, 0);
               if (var3 != 32767) {
                  boolean var4 = false;
                  class529 var5 = (class529)class328.field4479.method329((byte)99, (long)var3);
                  if (var5 == null) {
                     class506 var6 = new class506();
                     var6.field3862 = var3;
                     var5 = new class529(var6);
                     class328.field4479.method336(-1, (long)var3, var5);
                     class566.field8074[class213.field3041++] = var5;
                     var4 = true;
                  }

                  class506 var7 = var5.field7559;
                  class352.field4728[class475.field6836++] = var3;
                  var7.field3831 = class743.field10826;
                  if (var7.field7333 != null && var7.field7333.method5402((byte)2)) {
                     class414.method3096(var7, (byte)103);
                  }

                  int var8 = var2.method3844(2, 0);
                  int var9 = var2.method3844(1, 0);
                  if (~var9 == -2) {
                     class271.field3745[class214.field3064++] = var3;
                  }

                  int var10 = var2.method3844(5, 0);
                  if (~var10 < -16) {
                     var10 -= 32;
                  }

                  var7.method3673(class195.field2761.method1732(11268, var2.method3844(14, arg0 ^ 4652)), -108);
                  int var11 = var2.method3844(1, 0);
                  int var12 = (-648019961 & 4 + var2.method3844(3, 0)) << 11;
                  int var13 = var2.method3844(5, 0);
                  if (var13 > 15) {
                     var13 -= 32;
                  }

                  var7.method2118(false, var7.field7333.field10909);
                  var7.field3842 = var7.field7333.field10881 << 3;
                  if (var4) {
                     var7.method2122(-67, true, var12);
                  }

                  var7.method3674(var8, (byte)116, class564.field8045.field3884[0] - -var10, var11 == 1, var7.method972(-1), class564.field8045.field3888[0] + var13);
                  if (!var7.field7333.method5402((byte)5)) {
                     continue;
                  }

                  class695.method5062((class121)null, (class259)null, var7.field10701, var7.field3884[0], var7.field3888[0], var7, 256, 0);
                  if (var1) {
                     break;
                  }

                  if (!var1) {
                     continue;
                  }
               }
            }

            var2.method3843(37);
            break;
         }

      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field7010[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(IB)I",
      line = 95
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            method3554(-69);
         }

         ++field7004;
         return !class653.method4786((byte)-106, super.field683.field6419.method391(arg1 ^ 5)) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7010[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 110
   )
   public class489(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!vq",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 116
   )
   public class489(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "(IB)V",
      line = 119
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = -46 % ((arg1 - 47) / 46);
         ++field7000;
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7010[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "e",
      descriptor = "(I)I",
      line = 131
   )
   public final int method3555(int arg0) {
      try {
         int var2 = 68 % ((arg0 - 36) / 41);
         ++field7005;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7010[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(B)Z",
      line = 142
   )
   public final boolean method3556(byte arg0) {
      try {
         ++field7007;
         if (arg0 != 120) {
            this.method98(-15);
         }

         return class653.method4786((byte)-106, super.field683.field6419.method391(-54));
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7010[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(ZI)V",
      line = 161
   )
   public static final void method3557(boolean arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field7008;
         if (arg1 != -51) {
            method3557(false, 4);
         }

         class581.method4207(50);
         if (class321.method2375(false, class622.field9156)) {
            class10[] var3 = class430.field6154;
            int var4 = 0;
            if (!var2 && var3.length <= var4) {
               class581.method4207(50);
            } else {
               do {
                  class10 var5 = var3[var4];
                  ++var5.field107;
                  if (~var5.field107 > -51 && !arg0) {
                     return;
                  }

                  var5.field107 = 0;
                  if (!var5.field119 && var5.field102 != null) {
                     ++class455.field6471;
                     class447 var6 = class40.method350(class244.field3366, var5.field106, true);
                     var5.method55(13256, var6);

                     try {
                        var5.method52((byte)94);
                     } catch (IOException var8) {
                        var5.field119 = true;
                     }
                  }

                  ++var4;
               } while(var3.length > var4);

               class581.method4207(50);
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field7010[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "(I)I",
      line = 212
   )
   public final int method101(int arg0) {
      try {
         ++field7002;
         return arg0 >= -116 ? -108 : 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7010[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(I)V",
      line = 224
   )
   public final void method98(int arg0) {
      try {
         if (super.field683.field6419.method386(3) && !class653.method4786((byte)-106, super.field683.field6419.method391(86))) {
            super.field680 = 0;
         }

         ++field7001;
         if (arg0 > super.field680 || ~super.field680 < -3) {
            super.field680 = this.method101(-125);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7010[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3558(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3559(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
