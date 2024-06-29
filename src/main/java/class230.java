import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class230 {
   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2871 = new String[]{method1831(method1830("\u00007F\u0000'")), method1831(method1830("\u00040")), method1831(method1830("\u0018(\u0004.")), method1831(method1830("\u00007F\u0003'")), method1831(method1830("\rsFlr"))};
   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "I"
   )
   public static int field2869;
   @OriginalMember(
      owner = "client!vj",
      name = "b",
      descriptor = "I"
   )
   public static int field2870;

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(Ljava/awt/Component;IILgj;Z)Lce;"
   )
   public static final class591 method1828(Component arg0, int arg1, int arg2, class736 arg3, boolean arg4) {
      try {
         ++field2870;
         if (class36.field514 == 0) {
            throw new IllegalStateException();
         } else if (~arg1 <= -1 && arg1 < 2) {
            if (~arg2 > -257) {
               arg2 = 256;
            }

            try {
               class591 var5 = (class591)Class.forName(field2871[1]).newInstance();
               var5.field8712 = new int[(!class243.field3061 ? 1 : 2) * 256];
               var5.field8725 = arg2;
               var5.method895(arg0);
               var5.field8719 = (arg2 & -1024) + 1024;
               if (~var5.field8719 < -16385) {
                  var5.field8719 = 16384;
               }

               var5.method894(var5.field8719);
               if (~class10.field226 < -1 && class348.field4767 == null) {
                  class348.field4767 = new class239();
                  class348.field4767.field3040 = arg3;
                  arg3.method5338(0, class10.field226, class348.field4767);
               }

               if (class348.field4767 != null) {
                  if (class348.field4767.field3044[arg1] != null) {
                     throw new IllegalArgumentException();
                  }

                  class348.field4767.field3044[arg1] = var5;
               }

               return var5;
            } catch (Throwable var9) {
               try {
                  class96 var6 = new class96(arg3, arg1);
                  var6.field8725 = arg2;
                  var6.field8712 = new int[(class243.field3061 ? 2 : 1) * 256];
                  var6.method895(arg0);
                  var6.field8719 = 16384;
                  if (arg4) {
                     return null;
                  } else {
                     var6.method894(var6.field8719);
                     if (class10.field226 > 0 && class348.field4767 == null) {
                        class348.field4767 = new class239();
                        class348.field4767.field3040 = arg3;
                        arg3.method5338(0, class10.field226, class348.field4767);
                     }

                     if (class348.field4767 != null) {
                        if (class348.field4767.field3044[arg1] != null) {
                           throw new IllegalArgumentException();
                        }

                        class348.field4767.field3044[arg1] = var6;
                     }

                     return var6;
                  }
               } catch (Throwable var8) {
                  return new class591();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2871[3] + (arg0 != null ? field2871[4] : field2871[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2871[4] : field2871[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1829(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field2869;
         class553.field8135.method2190(false);
         class215.field2735.method194(-1);
         class3.field44.method2175(2);
         class438.field5967.method925(-49);
         class270.field3460.method5193((byte)48);
         class166.field2126.method5566(0);
         class532.field7812.method2471((byte)-64);
         class49.field688.method3865(38);
         class781.field11387.method1667(-1);
         class496.field6922.method3525((byte)105);
         class118.field1541.method1785(false);
         class449.field6093.method164((byte)-128);
         class754.field11043.method2625(arg0 + 454);
         class327.field4526.method1605(118);
         class237.field3002.method4934(-25014);
         class778.field11334.method5297((byte)-111);
         class566.field8336.method1211(true);
         class263.field3339.method2099((byte)-90);
         class720.field10555.method3234(16);
         class784.field11462.method2048((byte)-47);
         class215.field2731.method5038((byte)-114);
         class339.field4639.method2613(256);
         class45.field579.method3471((byte)-99);
         class93.method858(32);
         class595.method4433((byte)-53);
         class616.method4543(arg0 ^ -95);
         class637.method4697((byte)101);
         if (class781.field11380 != class583.field8611) {
            int var2 = 0;
            if (var1) {
               class513.field7153[var2] = null;
               ++var2;
            }

            while(true) {
               while(class513.field7153.length > var2) {
                  class513.field7153[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class679.field10007 = 0;
                  break;
               }

               ++var2;
            }
         }

         class587.method4374(arg0 + -59);
         class81.method790((byte)67);
         class202.method1676(arg0 ^ 30517);
         class436.method3368((byte)-79);
         class70.method692(124);
         class256.field3218.method3201((byte)95);
         class629.field9294.method505();
         class375.method2960(arg0 ^ 58);
         class247.method1965(arg0 + -90);
         class207.field2633.method2701((byte)116);
         class23.field348.method2701((byte)113);
         class405.field5558.method2701((byte)115);
         class774.field11274.method2701((byte)127);
         class604.field8873.method2701((byte)109);
         class657.field9803.method2701((byte)127);
         class146.field1826.method2701((byte)116);
         class559.field8185.method2701((byte)113);
         class268.field3430.method2701((byte)121);
         class323.field4422.method2701((byte)114);
         class533.field7829.method2701((byte)113);
         class721.field10559.method2701((byte)118);
         class160.field2044.method2701((byte)124);
         class94.field1276.method2701((byte)120);
         class392.field5431.method2701((byte)110);
         class428.field5815.method2701((byte)117);
         class755.field11061.method2701((byte)119);
         class762.field11161.method2701((byte)124);
         class504.field7017.method2701((byte)127);
         class741.field10844.method2701((byte)123);
         class159.field2038.method2701((byte)115);
         class674.field9987.method2701((byte)114);
         class494.field6896.method2701((byte)105);
         class487.field6798.method2701((byte)119);
         class25.field386.method2701((byte)114);
         class587.field8664.method2701((byte)125);
         class224.field2810.method2701((byte)118);
         class560.field8199.method2701((byte)105);
         class329.field4555.method2701((byte)117);
         class592.field8734.method2701((byte)127);
         class520.field7305.method2701((byte)122);
         class47.field598.method2701((byte)120);
         class47.field599.method2701((byte)127);
         class507.field7062.method3201((byte)-97);
         class693.field10170.method3201((byte)-52);
         if (arg0 == 58) {
            class321.field4410.method3201((byte)-91);
            class286.field3959.method3201((byte)114);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2871[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1830(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1831(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
