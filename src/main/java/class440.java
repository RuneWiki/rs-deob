import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class440 {
   @OriginalMember(
      owner = "client!nn",
      name = "i",
      descriptor = "Ltv;"
   )
   private class590 field6104 = new class590(64);
   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "Lqh;"
   )
   private class74 field6111;
   @OriginalMember(
      owner = "client!nn",
      name = "l",
      descriptor = "I"
   )
   public int field6110;
   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6114 = new String[]{method3277(method3276("^V|p\u007f")), method3277(method3276("^V|z\u007f")), method3277(method3276("^V|\u000e>^Q&\f\u007f")), method3277(method3276("K\u0016|\u001c*")), method3277(method3276("^M>^")), method3277(method3276("^V|s\u007f")), method3277(method3276("^V|u\u007f")), method3277(method3276("^V|t\u007f")), method3277(method3276("\u001c\u0018 G9^Q<Um\u0010")), method3277(method3276("\u001e\u0018\u0006[:U\u0018&S<UVh\u0012")), method3277(method3276("]K")), method3277(method3276("^V|w\u007f")), method3277(method3276("uU;F#UJ!\bw")), method3277(method3276("`Y F>ST7\u0012$IK&W:\u0010[=G9D\u0002r")), method3277(method3276("\u0010h3@#Y[>W$\n\u0018")), method3277(method3276("^V|q\u007f")), method3277(method3276("^V|v\u007f"))};
   @OriginalMember(
      owner = "client!nn",
      name = "h",
      descriptor = "Lnw;"
   )
   public static class616 field6107 = new class616(33, 8);
   @OriginalMember(
      owner = "client!nn",
      name = "k",
      descriptor = "I"
   )
   public static int field6102;
   @OriginalMember(
      owner = "client!nn",
      name = "j",
      descriptor = "I"
   )
   public static int field6103;
   @OriginalMember(
      owner = "client!nn",
      name = "f",
      descriptor = "I"
   )
   public static int field6105;
   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "I"
   )
   public static int field6106;
   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "I"
   )
   public static int field6108;
   @OriginalMember(
      owner = "client!nn",
      name = "d",
      descriptor = "I"
   )
   public static int field6109;
   @OriginalMember(
      owner = "client!nn",
      name = "g",
      descriptor = "I"
   )
   public static int field6112;
   @OriginalMember(
      owner = "client!nn",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6113;

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(II)Lrs;"
   )
   public final class682 method3268(int arg0, int arg1) {
      try {
         ++field6109;
         class590 var3 = this.field6104;
         class682 var4;
         synchronized(this.field6104) {
            var4 = (class682)this.field6104.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field6111;
            byte[] var6;
            synchronized(this.field6111) {
               var6 = this.field6111.method732(arg1, 16, (byte)85);
            }

            if (arg0 != 8) {
               return null;
            } else {
               class682 var7 = new class682();
               if (var6 != null) {
                  var7.method4987(new class594(var6), true);
               }

               class590 var8 = this.field6104;
               synchronized(this.field6104) {
                  this.field6104.method4238(123, var7, (long)arg1);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field6114[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(ILwm;)Lge;"
   )
   public static final class740 method3269(int arg0, class594 arg1) {
      try {
         ++field6103;
         int var2 = arg1.method4288((byte)62);
         class190 var3 = class127.method1068((byte)71)[arg1.method4288((byte)63)];
         class169 var4 = class393.method2992(112)[arg1.method4288((byte)77)];
         int var5 = arg1.method4333(-96);
         int var6 = arg1.method4333(-56);
         int var7 = -66 % ((arg0 - -28) / 48);
         int var8 = arg1.method4280(-19104);
         int var9 = arg1.method4280(-19104);
         int var10 = arg1.method4302(true);
         int var11 = arg1.method4302(true);
         int var12 = arg1.method4302(true);
         boolean var13 = arg1.method4288((byte)126) == 1;
         return new class740(var2, var3, var4, var5, var6, var8, var9, var10, var11, var12, var13);
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field6114[5] + arg0 + ',' + (arg1 != null ? field6114[3] : field6114[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3270(int arg0) {
      try {
         ++field6112;
         class590 var2 = this.field6104;
         synchronized(this.field6104) {
            if (arg0 <= -17) {
               this.field6104.method4245(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6114[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3271(int arg0) {
      try {
         if (arg0 <= 120) {
            field6113 = null;
         }

         field6113 = null;
         field6107 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6114[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3272(int arg0, byte arg1) {
      try {
         class590 var3 = this.field6104;
         synchronized(this.field6104) {
            if (arg1 <= 10) {
               method3269(-75, (class594)null);
            }

            this.field6104.method4234(2, arg0);
         }

         ++field6105;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6114[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3273(int arg0) {
      try {
         class590 var2 = this.field6104;
         synchronized(this.field6104) {
            this.field6104.method4244(true);
         }

         ++field6102;
         if (arg0 != -22540) {
            field6107 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6114[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(Lha;JZ)V"
   )
   public static final void method3274(class65 arg0, long arg1, boolean arg2) {
      boolean var4 = client.field4273;

      try {
         class766.field11059 = 0;
         class653.field9145 = 0;
         class278.field3707 = class192.field2347;
         ++field6106;
         class192.field2347 = 0;
         if (arg2) {
            long var5 = class792.method5708(-25005);
            class672 var7 = (class672)class650.field9113.method3110(-100);
            if (var4) {
               if (var7.method4934(arg0, arg1)) {
                  ++class653.field9145;
               }

               var7 = (class672)class650.field9113.method3114(2);
            }

            while(true) {
               boolean var10000;
               if (var7 == null) {
                  var10000 = class253.field3208;
                  if (!var4) {
                     if (var10000 && arg1 % 100L == 0L) {
                        System.out.println(field6114[13] + class650.field9113.method3111(true) + field6114[8] + class653.field9145);
                        System.out.println(field6114[12] + class766.field11059 + field6114[14] + class192.field2347 + field6114[9] + (-var5 + class792.method5708(-25005)) + field6114[10]);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var7.method4934(arg0, arg1);
               }

               if (var10000) {
                  ++class653.field9145;
               }

               var7 = (class672)class650.field9113.method3114(2);
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6114[11] + (arg0 != null ? field6114[3] : field6114[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class440(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field6111 = arg2;
         if (this.field6111 != null) {
            this.field6110 = this.field6111.method727(16, -32767);
         } else {
            this.field6110 = 0;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6114[2] + (arg0 != null ? field6114[3] : field6114[4]) + ',' + arg1 + ',' + (arg2 != null ? field6114[3] : field6114[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method3275(String arg0, byte arg1) {
      try {
         ++field6108;
         if (class394.field5563 != null) {
            ++class508.field7045;
            class223 var2 = class355.method2790(13111);
            class471 var3 = class133.method1118(var2.field2787, 2, class793.field11589);
            if (arg1 < -118) {
               var3.field6527.method4318(class190.method1432(10524, arg0), 0);
               var3.field6527.method4332((byte)-124, arg0);
               var2.method1702((byte)-107, var3);
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6114[7] + (arg0 != null ? field6114[3] : field6114[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3276(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3277(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
