import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class674 {
   @OriginalMember(
      owner = "client!iea",
      name = "n",
      descriptor = "Lsia;"
   )
   private class407 field9979 = new class407(128);
   @OriginalMember(
      owner = "client!iea",
      name = "e",
      descriptor = "Lsia;"
   )
   public class407 field9992 = new class407(64);
   @OriginalMember(
      owner = "client!iea",
      name = "m",
      descriptor = "Lww;"
   )
   private class339 field9982;
   @OriginalMember(
      owner = "client!iea",
      name = "l",
      descriptor = "Lww;"
   )
   public class339 field9990;
   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9993 = new String[]{method4939(method4938("\u0011u!5%P")), method4939(method4938("\u0011u!5 P")), method4939(method4938("Ds/w_H &}RH.")), method4939(method4938("Ds/w_@ &}RH.")), method4939(method4938("Ds/w_\u001ev&}RH.")), method4939(method4938("Ds/w_L &}RH.")), method4939(method4938("Ds/w_\u001ev\"+RH.")), method4939(method4938("Ds/w_\u001evw+RH.")), method4939(method4938("\u0011u!5#P")), method4939(method4938("Ds/w_\u001evs+RH.")), method4939(method4938("Ds/w_\u001evp+RH.")), method4939(method4938("Ds/w_\u001b &}RH.")), method4939(method4938("\u0003>n5\u001f")), method4939(method4938("\u0011u!5^\u0011~)o\\P")), method4939(method4938("\u0016e,w")), method4939(method4938("\u0011u!5$P")), method4939(method4938("\u0011u!5!P")), method4939(method4938("\u0011u!5'P")), method4939(method4938("\u0011u!5&P")), method4939(method4938("\u0011u!5*P"))};
   @OriginalMember(
      owner = "client!iea",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field9980 = true;
   @OriginalMember(
      owner = "client!iea",
      name = "f",
      descriptor = "I"
   )
   public static int field9977;
   @OriginalMember(
      owner = "client!iea",
      name = "h",
      descriptor = "I"
   )
   public static int field9981;
   @OriginalMember(
      owner = "client!iea",
      name = "p",
      descriptor = "I"
   )
   public static int field9983;
   @OriginalMember(
      owner = "client!iea",
      name = "b",
      descriptor = "I"
   )
   public static int field9984;
   @OriginalMember(
      owner = "client!iea",
      name = "j",
      descriptor = "I"
   )
   public static int field9985;
   @OriginalMember(
      owner = "client!iea",
      name = "d",
      descriptor = "I"
   )
   public static int field9986;
   @OriginalMember(
      owner = "client!iea",
      name = "c",
      descriptor = "I"
   )
   public static int field9988;
   @OriginalMember(
      owner = "client!iea",
      name = "g",
      descriptor = "I"
   )
   public static int field9989;
   @OriginalMember(
      owner = "client!iea",
      name = "i",
      descriptor = "I"
   )
   public static int field9991;
   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "Lww;"
   )
   public static class339 field9987;
   @OriginalMember(
      owner = "client!iea",
      name = "k",
      descriptor = "Lmk;"
   )
   public static class360 field9978;

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4930(byte arg0) {
      try {
         class407 var2 = this.field9979;
         synchronized(this.field9979) {
            if (arg0 != 116) {
               return;
            }

            this.field9979.method3187(arg0 + -23941);
         }

         ++field9977;
         class407 var3 = this.field9992;
         synchronized(this.field9992) {
            this.field9992.method3187(arg0 + -23941);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9993[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4931(boolean arg0) {
      try {
         if (!arg0) {
            field9987 = null;
            field9978 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9993[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "b",
      descriptor = "(III)Ljava/lang/String;"
   )
   public static final String method4932(int arg0, int arg1, int arg2) {
      try {
         ++field9991;
         int var3 = -arg2 + arg1;
         if (~var3 > 8) {
            return field9993[10];
         } else if (~var3 > 5) {
            return field9993[9];
         } else if (var3 < -3) {
            return field9993[7];
         } else if (~var3 > -1) {
            return field9993[6];
         } else if (~var3 < -10) {
            return field9993[2];
         } else if (var3 > 6) {
            return field9993[5];
         } else if (arg0 < var3) {
            return field9993[3];
         } else {
            return ~var3 < -1 ? field9993[11] : field9993[4];
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9993[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method4933(byte arg0, int arg1) {
      try {
         class407 var3 = this.field9979;
         synchronized(this.field9979) {
            if (arg0 != 8) {
               this.method4934(89);
            }

            this.field9979.method3197(5, arg1);
         }

         ++field9986;
         class407 var4 = this.field9992;
         synchronized(this.field9992) {
            this.field9992.method3197(5, arg1);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9993[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4934(int arg0) {
      try {
         ++field9989;
         class407 var2 = this.field9979;
         synchronized(this.field9979) {
            this.field9979.method3201((byte)-91);
         }

         class407 var3 = this.field9992;
         synchronized(this.field9992) {
            this.field9992.method3201((byte)99);
            if (arg0 != -25014) {
               field9987 = null;
            }

         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field9993[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(ILmb;)V"
   )
   public static final void method4935(int arg0, class431 arg1) {
      try {
         arg1.method649((byte)-124, class207.field2633.method2686(83));
         ++field9981;
         arg1.method649((byte)-124, class23.field348.method2686(-112));
         arg1.method649((byte)-124, class405.field5558.method2686(126));
         arg1.method649((byte)-124, class774.field11274.method2686(arg0 ^ -115));
         arg1.method649((byte)-124, class604.field8873.method2686(116));
         arg1.method649((byte)-124, class657.field9803.method2686(95));
         arg1.method649((byte)-124, class146.field1826.method2686(-69));
         arg1.method649((byte)-124, class559.field8185.method2686(-106));
         arg1.method649((byte)-124, class268.field3430.method2686(90));
         arg1.method649((byte)-124, class323.field4422.method2686(arg0 ^ -17));
         arg1.method649((byte)-124, class533.field7829.method2686(-100));
         arg1.method649((byte)-124, class721.field10559.method2686(111));
         arg1.method649((byte)-124, class160.field2044.method2686(arg0 ^ 126));
         arg1.method649((byte)-124, class94.field1276.method2686(-86));
         arg1.method649((byte)-124, class392.field5431.method2686(101));
         arg1.method649((byte)-124, class428.field5815.method2686(arg0 ^ 112));
         arg1.method649((byte)-124, class755.field11061.method2686(-96));
         arg1.method649((byte)-124, class762.field11161.method2686(-92));
         arg1.method649((byte)-124, class504.field7017.method2686(-93));
         arg1.method649((byte)-124, class741.field10844.method2686(-93));
         arg1.method649((byte)-124, class159.field2038.method2686(110));
         arg1.method649((byte)-124, field9987.method2686(106));
         arg1.method649((byte)-124, class494.field6896.method2686(118));
         arg1.method649((byte)-124, class487.field6798.method2686(-93));
         arg1.method649((byte)-124, class25.field386.method2686(-67));
         arg1.method649((byte)-124, class587.field8664.method2686(arg0 + 80));
         arg1.method649((byte)-124, class224.field2810.method2686(105));
         arg1.method649((byte)-124, class560.field8199.method2686(125));
         arg1.method649((byte)-124, class329.field4555.method2686(-60));
         arg1.method649((byte)-124, class592.field8734.method2686(93));
         arg1.method649((byte)-124, class520.field7305.method2686(-31));
         arg1.method649((byte)-124, class47.field598.method2686(-78));
         arg1.method649((byte)-124, class127.method1091(-12060));
         if (arg0 != 36) {
            field9984 = -80;
         }

         arg1.method649((byte)-124, class401.method3145((byte)47));
         arg1.method649((byte)-124, class47.field599.method2686(arg0 + 68));
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9993[18] + arg0 + ',' + (arg1 != null ? field9993[12] : field9993[14]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4936(int arg0, int arg1, int arg2) {
      try {
         ++field9983;
         if (arg1 != 12646) {
            field9984 = -70;
         }

         this.field9979 = new class407(arg0);
         this.field9992 = new class407(arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9993[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(IZ)Lkka;"
   )
   public final class519 method4937(int arg0, boolean arg1) {
      try {
         ++field9988;
         class407 var3 = this.field9979;
         class519 var4;
         synchronized(this.field9979) {
            var4 = (class519)this.field9979.method3192((long)arg0, (byte)-118);
         }

         if (!arg1) {
            this.method4936(-71, 57, -34);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field9982;
            byte[] var6;
            synchronized(this.field9982) {
               var6 = this.field9982.method2697(arg0, 36, false);
            }

            class519 var7 = new class519();
            var7.field7270 = arg0;
            var7.field7272 = this;
            if (var6 != null) {
               var7.method3898(new class66(var6), 112);
            }

            var7.method3900(-119);
            class407 var8 = this.field9979;
            synchronized(this.field9979) {
               this.field9979.method3190(var7, (long)arg0, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field9993[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lww;)V"
   )
   public class674(class500 arg0, int arg1, class339 arg2, class339 arg3) {
      try {
         this.field9982 = arg2;
         this.field9990 = arg3;
         this.field9982.method2691(36, -57);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9993[13] + (arg0 != null ? field9993[12] : field9993[14]) + ',' + arg1 + ',' + (arg2 != null ? field9993[12] : field9993[14]) + ',' + (arg3 != null ? field9993[12] : field9993[14]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4938(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4939(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
