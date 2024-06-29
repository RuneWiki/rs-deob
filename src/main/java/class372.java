import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class372 implements Runnable {
   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5462 = new String[]{method2919(method2918("a\u001d\u00025\u0000%")), method2919(method2918("a\u001d\u00025\u0001%")), method2919(method2918("a\u001d\u00025\u0006%")), method2919(method2918("a\u001d\u000257x\u001aK")), method2919(method2918("a\u001d\u00025\u0004%")), method2919(method2918("a\u001d\u00025\u0007%")), method2919(method2918("e\u0000\u0017k\u007f\"[")), method2919(method2918("\"\u001a\u0006l6#\u0003\u0010$\"l\u0019\u0006&"))};
   @OriginalMember(
      owner = "client!lia",
      name = "g",
      descriptor = "I"
   )
   public static int field5453;
   @OriginalMember(
      owner = "client!lia",
      name = "h",
      descriptor = "I"
   )
   public static int field5455;
   @OriginalMember(
      owner = "client!lia",
      name = "e",
      descriptor = "I"
   )
   public static int field5457;
   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "I"
   )
   public static int field5459;
   @OriginalMember(
      owner = "client!lia",
      name = "c",
      descriptor = "I"
   )
   public static int field5460;
   @OriginalMember(
      owner = "client!lia",
      name = "d",
      descriptor = "I"
   )
   public static int field5461;
   @OriginalMember(
      owner = "client!lia",
      name = "j",
      descriptor = "Ldu;"
   )
   private class92 field5456;
   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field5458;
   @OriginalMember(
      owner = "client!lia",
      name = "i",
      descriptor = "Z"
   )
   private volatile boolean field5452;
   @OriginalMember(
      owner = "client!lia",
      name = "f",
      descriptor = "[Lri;"
   )
   private class596[] field5454;

   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method2913(int arg0, int arg1) {
      try {
         ++field5457;
         class111 var2 = class796.method5734(arg1, (long)arg0, (byte)-122);
         var2.method1083(-59);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5462[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method2914(boolean arg0) {
      try {
         ++field5461;
         if (this.field5452) {
            return true;
         } else {
            if (this.field5456 == null) {
               try {
                  int var2 = class479.field6892 == class160.field2451 ? 80 : 7000 - -class107.field1674.field2262;
                  this.field5456 = class720.field10318.method865(0, new URL(field5462[6] + class107.field1674.field2258 + ":" + var2 + field5462[7] + class343.field5054.field5700));
               } catch (MalformedURLException var4) {
                  return true;
               }
            }

            if (!arg0) {
               this.field5454 = null;
            }

            if (this.field5456 != null && ~this.field5456.field1526 != -3) {
               if (~this.field5456.field1526 != -2) {
                  return false;
               } else {
                  if (this.field5458 == null) {
                     this.field5458 = new Thread(this);
                     this.field5458.start();
                  }

                  return this.field5452;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5462[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2915(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field5455;
         class9.field160.method5483(64);
         class142.field2263.method2704((byte)8);
         class226.field3299.method3408((byte)-57);
         class549.field7834.method3849(-63);
         class478.field6879.method4876((byte)104);
         class201.field2882.method5588(arg0 + 15);
         class216.field3085.method4249((byte)71);
         class183.field2689.method3230(true);
         class225.field3194.method2720((byte)-9);
         class690.field9935.method3943(93);
         class383.field5588.method2659(117);
         class283.field4267.method1703(-18991);
         class378.field5523.method1304(false);
         class376.field5490.method2360(-9370);
         class33.field467.method1753(-7404);
         class78.field1245.method3823((byte)59);
         class746.field10611.method1222(11);
         class705.field10141.method1464(0);
         class376.field5487.method4561(100);
         class237.field3664.method1108((byte)100);
         class787.field11478.method3715(125);
         class316.field4722.method3922(arg0 + 21486);
         class300.field4488.method1845(46);
         class778.method5621(-5168);
         class358.method2811((byte)-110);
         class607.method4474(12);
         class176.method1615(73);
         if (class479.field6892 != class160.field2451) {
            int var2 = 0;
            if (var1) {
               class269.field4121[var2] = null;
               ++var2;
            }

            while(true) {
               while(~var2 > ~class269.field4121.length) {
                  class269.field4121[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class277.field4200 = 0;
                  break;
               }

               ++var2;
            }
         }

         class172.method1594(-29908);
         class796.method5739(20);
         class322.method2597((byte)-90);
         class383.method2985(arg0 + 22222);
         class91.method939(false);
         class427.field6234.method1052(true);
         class54.field794.method207();
         class692.method5019((byte)-48);
         class117.method1140((byte)-15);
         class121.field1955.method438((byte)102);
         class13.field195.method438(arg0);
         class324.field4825.method438((byte)62);
         class379.field5554.method438((byte)48);
         class327.field4855.method438((byte)41);
         class488.field6962.method438((byte)103);
         class580.field8166.method438((byte)26);
         class571.field8096.method438((byte)111);
         class790.field11506.method438((byte)79);
         class7.field126.method438((byte)52);
         class448.field6520.method438((byte)18);
         class72.field1167.method438((byte)84);
         class577.field8143.method438((byte)42);
         class1.field5.method438((byte)21);
         class306.field4638.method438((byte)125);
         class348.field5112.method438((byte)34);
         class442.field6467.method438((byte)73);
         class344.field5067.method438((byte)32);
         class283.field4282.method438((byte)51);
         class184.field2712.method438((byte)48);
         class778.field11349.method438((byte)57);
         class517.field7316.method438((byte)37);
         class692.field9956.method438((byte)69);
         class254.field3858.method438((byte)68);
         class435.field6370.method438((byte)66);
         class496.field7072.method438((byte)114);
         class278.field4220.method438((byte)113);
         class290.field4346.method438((byte)20);
         class324.field4827.method438((byte)108);
         class156.field2386.method438((byte)86);
         class492.field7020.method438((byte)70);
         class199.field2876.method438((byte)51);
         class499.field7100.method438((byte)13);
         class605.field8625.method1052(true);
         class306.field4633.method1052(true);
         class588.field8263.method1052(true);
         class253.field3838.method1052(true);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5462[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(II)Lri;"
   )
   public final class596 method2916(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            return null;
         } else {
            ++field5460;
            return this.field5454 != null && arg0 >= 0 && ~this.field5454.length < ~arg0 ? this.field5454[arg0] : null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5462[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2917(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field5459;
         if (class341.field5025 != null) {
            int var2 = 0;
            if (var1 || ~class341.field5025.length < ~var2) {
               do {
                  int var3 = 0;
                  if (var1) {
                     class341.field5025[var2][var3] = class418.field6116;
                     ++var3;
                  }

                  while(true) {
                     while(~var3 > ~class341.field5025[var2].length) {
                        class341.field5025[var2][var3] = class418.field6116;
                        ++var3;
                     }

                     if (!var1) {
                        ++var2;
                        break;
                     }

                     ++var3;
                  }
               } while(~class341.field5025.length < ~var2);
            }
         }

         if (arg0 != 79) {
            method2917((byte)-17);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5462[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2918(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2919(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
