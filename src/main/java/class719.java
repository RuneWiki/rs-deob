import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class719 implements Runnable {
   @OriginalMember(
      owner = "client!hg",
      name = "s",
      descriptor = "Z"
   )
   public boolean field10710 = false;
   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "Lil;"
   )
   public class7 field10711 = null;
   @OriginalMember(
      owner = "client!hg",
      name = "A",
      descriptor = "Z"
   )
   public boolean field10706 = false;
   @OriginalMember(
      owner = "client!hg",
      name = "e",
      descriptor = "Lil;"
   )
   public class7 field10699 = null;
   @OriginalMember(
      owner = "client!hg",
      name = "o",
      descriptor = "Lil;"
   )
   public class7 field10707 = null;
   @OriginalMember(
      owner = "client!hg",
      name = "x",
      descriptor = "Ldaa;"
   )
   private class12 field10721 = null;
   @OriginalMember(
      owner = "client!hg",
      name = "F",
      descriptor = "Ldaa;"
   )
   private class12 field10716 = null;
   @OriginalMember(
      owner = "client!hg",
      name = "B",
      descriptor = "Z"
   )
   private boolean field10717 = false;
   @OriginalMember(
      owner = "client!hg",
      name = "h",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field10715;
   @OriginalMember(
      owner = "client!hg",
      name = "y",
      descriptor = "[Lil;"
   )
   public class7[] field10718;
   @OriginalMember(
      owner = "client!hg",
      name = "q",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10704;
   @OriginalMember(
      owner = "client!hg",
      name = "c",
      descriptor = "Lnp;"
   )
   private class516 field10712;
   @OriginalMember(
      owner = "client!hg",
      name = "f",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10694;
   @OriginalMember(
      owner = "client!hg",
      name = "r",
      descriptor = "Lip;"
   )
   private class735 field10701;
   @OriginalMember(
      owner = "client!hg",
      name = "i",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10703;
   @OriginalMember(
      owner = "client!hg",
      name = "D",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field10695;
   @OriginalMember(
      owner = "client!hg",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10726 = new String[]{method5219(method5218("R8+Q\u0018i.6")), method5219(method5218("numV_c!6\u000e")), method5219(method5218("R=!\u000fRl;")), method5219(method5218("num")), method5219(method5218("#+#U")), method5219(method5218("numSEn.!IS\"")), method5219(method5218("\u007f8")), method5219(method5218("\";/Q\u0019")), method5219(method5218("numV_c+-VE\"")), method5219(method5218("g.%DNR")), method5219(method5218("R?0DPh='OUh<")), method5219(method5218("\"=1BWn''\u000e")), method5219(method5218("~*6gYn:1uDl9'SEl#\tDO~\n,@Ta*&")), method5219(method5218("~*6gYn:1bOn#'sYb;")), method5219(method5218("`&!SY~ $U")), method5219(method5218("s`")), method5219(method5218("g.4@\u0018l86\u000fub!6@_c*0")), method5219(method5218("b<lOW`*")), method5219(method5218("`.+Oik&.Din.!IS#+#U\u0004")), method5219(method5218("`.+Oik&.Din.!IS#&&Y")), method5219(method5218("y!")), method5219(method5218("g.4@\u0018{*0R_b!")), method5219(method5218("`.+Oik&.Din.!IS#&&Y\u00048z")), method5219(method5218("g.4@\u0018l86\u000fub\"2NXh!6")), method5219(method5218("L\u0018\u0016")), method5219(method5218("b<lWS\u007f<+NX")), method5219(method5218("g.4@\u0018{*,EY\u007f")), method5219(method5218("X!)OYz!")), method5219(method5218("\u007f.,EY`a&@B")), method5219(method5218("f+")), method5219(method5218("g,")), method5219(method5218("b<l@Dn'")), method5219(method5218("<as")), method5219(method5218("x<'S\u0018e /D")), method5219(method5218("a&1U[b+'R")), method5219(method5218("` 4D[b:1D")), method5219(method5218("~'-VUx=1ND")), method5219(method5218("z&,")), method5219(method5218("~*6BC~;-LUx=1ND")), method5219(method5218("l-!ESk(*H\\f#/OY}>0RBx95YOw\u000e\u0000brH\t\u0005i\u007fG\u0004\u000elxB\u001f\u0013seY\u001a\u0014vnT\u0015r\u0010\u0004>{w\u0017\u00015v}\u0007\u000b!ag\n\u001bRlx\u000e\u001c")), method5219(method5218("n\"&\u0001\u0019no1UW\u007f;b\u0003\\/o`")), method5219(method5218("h!6DD")), method5219(method5218("V\u0006")), method5219(method5218("e;6Q\f\"`")), method5219(method5218("h7+U")), method5219(method5218("G.%DN-\t7MZ-\u001c!SSh!")), method5219(method5218("e;6QE7`m")), method5219(method5218("g.4@\u0018l86\u000ffb&,U")), method5219(method5218("g.4@\u0018l86\u000fp\u007f./D"))};
   @OriginalMember(
      owner = "client!hg",
      name = "m",
      descriptor = "J"
   )
   private static volatile long field10700 = 0L;
   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "I"
   )
   private static int field10702;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hg",
      name = "C",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10722;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hg",
      name = "j",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10723;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hg",
      name = "d",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10724;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hg",
      name = "k",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10725;
   @OriginalMember(
      owner = "client!hg",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10696;
   @OriginalMember(
      owner = "client!hg",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   private static String field10697;
   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10698;
   @OriginalMember(
      owner = "client!hg",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10705;
   @OriginalMember(
      owner = "client!hg",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10708;
   @OriginalMember(
      owner = "client!hg",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private static String field10713;
   @OriginalMember(
      owner = "client!hg",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   private static String field10714;
   @OriginalMember(
      owner = "client!hg",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10719;
   @OriginalMember(
      owner = "client!hg",
      name = "l",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field10709;
   @OriginalMember(
      owner = "client!hg",
      name = "v",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field10720;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method5217(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(B)Z",
      line = 7
   )
   public final boolean method5197(byte arg0) {
      int var2 = -59 % ((arg0 - -12) / 61);
      if (!this.field10710) {
         return false;
      } else if (!this.field10706) {
         return this.field10694 != null;
      } else {
         return this.field10712 != null;
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "run",
      descriptor = "()V",
      line = 24
   )
   public final void run() {
      while(true) {
         class12 var2;
         synchronized(this) {
            while(true) {
               if (this.field10717) {
                  return;
               }

               if (this.field10721 != null) {
                  var2 = this.field10721;
                  this.field10721 = this.field10721.field157;
                  if (this.field10721 == null) {
                     this.field10716 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var30) {
               }
            }
         }

         try {
            int var3 = var2.field161;
            if (~var3 == -2) {
               if (field10700 > class188.method1462(true)) {
                  throw new IOException();
               }

               var2.field160 = new Socket(InetAddress.getByName((String)var2.field158), var2.field155);
            } else if (~var3 != -23) {
               if (~var3 == -3) {
                  Thread var22 = new Thread((Runnable)var2.field158);
                  var22.setDaemon(true);
                  var22.start();
                  var22.setPriority(var2.field155);
                  var2.field160 = var22;
               } else if (var3 == 4) {
                  if (field10700 > class188.method1462(true)) {
                     throw new IOException();
                  }

                  var2.field160 = new DataInputStream(((URL)var2.field158).openStream());
               } else if (var3 == 8) {
                  Object[] var21 = (Object[])var2.field158;
                  if (this.field10710 && ((Class)var21[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field160 = ((Class)var21[0]).getDeclaredMethod((String)var21[1], (Class[])var21[2]);
               } else if (var3 == 9) {
                  Object[] var4 = (Object[])var2.field158;
                  if (this.field10710 && ((Class)var4[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field160 = ((Class)var4[0]).getDeclaredField((String)var4[1]);
               } else if (~var3 == -19) {
                  Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                  var2.field160 = var20.getContents((Object)null);
               } else if (~var3 != -20) {
                  if (!this.field10710) {
                     throw new Exception("");
                  }

                  if (~var3 != -4) {
                     if (var3 == 21) {
                        if (class188.method1462(true) < field10700) {
                           throw new IOException();
                        }

                        var2.field160 = InetAddress.getByName((String)var2.field158).getAddress();
                     } else if (var3 != 5) {
                        if (var3 == 6) {
                           Frame var5 = new Frame(field10726[45]);
                           var2.field160 = var5;
                           var5.setResizable(false);
                           if (this.field10706) {
                              this.field10712.method3820(var2.field155 >>> 16, var2.field156 >> 16, var2.field155 & 65535, 65535 & var2.field156, var5, (byte)8);
                           } else {
                              Class.forName(field10726[30]).getMethod(field10726[41], field10722 != null ? field10722 : (field10722 = method5217(field10726[48])), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field10694, var5, new Integer(var2.field155 >>> 16), new Integer(var2.field155 & 65535), new Integer(var2.field156 >> 16), new Integer(var2.field156 & 65535));
                           }
                        } else if (~var3 == -8) {
                           if (!this.field10706) {
                              Class.forName(field10726[30]).getMethod(field10726[44]).invoke(this.field10694);
                           } else {
                              this.field10712.method3819((Frame)var2.field158, 8);
                           }
                        } else if (~var3 == -13) {
                           class7 var16 = method5205((String)var2.field158, 104, field10702, field10697);
                           var2.field160 = var16;
                        } else if (~var3 == -14) {
                           class7 var6 = method5205((String)var2.field158, 107, field10702, "");
                           var2.field160 = var6;
                        } else if (this.field10710 && var3 == 14) {
                           int var7 = var2.field155;
                           int var8 = var2.field156;
                           if (!this.field10706) {
                              Class.forName(field10726[20]).getDeclaredMethod(field10726[35], Integer.TYPE, Integer.TYPE).invoke(this.field10703, new Integer(var7), new Integer(var8));
                           } else {
                              this.field10701.method5348(var8, var7, 122);
                           }
                        } else if (this.field10710 && ~var3 == -16) {
                           boolean var9 = ~var2.field155 != -1;
                           Component var10 = (Component)var2.field158;
                           if (this.field10706) {
                              this.field10701.method5349(var10, (byte)-36, var9);
                           } else {
                              Class.forName(field10726[20]).getDeclaredMethod(field10726[36], field10723 != null ? field10723 : (field10723 = method5217(field10726[23])), Boolean.TYPE).invoke(this.field10703, var10, new Boolean(var9));
                           }
                        } else if (!this.field10706 && ~var3 == -18) {
                           Object[] var11 = (Object[])var2.field158;
                           Class.forName(field10726[20]).getDeclaredMethod(field10726[38], field10723 != null ? field10723 : (field10723 = method5217(field10726[23])), field10724 != null ? field10724 : (field10724 = method5217(field10726[42])), Integer.TYPE, Integer.TYPE, field10725 != null ? field10725 : (field10725 = method5217(field10726[47]))).invoke(this.field10703, (Component)var11[0], (int[])var11[1], new Integer(var2.field155), new Integer(var2.field156), (Point)var11[2]);
                        } else {
                           if (var3 != 16) {
                              throw new Exception("");
                           }

                           try {
                              if (!field10719.startsWith(field10726[37])) {
                                 throw new Exception();
                              }

                              String var12 = (String)var2.field158;
                              if (!var12.startsWith(field10726[43]) && !var12.startsWith(field10726[46])) {
                                 throw new Exception();
                              }

                              String var13 = field10726[39];
                              int var14 = 0;

                              while(true) {
                                 if (~var12.length() >= ~var14) {
                                    Runtime.getRuntime().exec(field10726[40] + var12 + "\"");
                                    var2.field160 = null;
                                    break;
                                 }

                                 if (var13.indexOf(var12.charAt(var14)) == -1) {
                                    throw new Exception();
                                 }

                                 ++var14;
                              }
                           } catch (Exception var31) {
                              var2.field160 = var31;
                              throw var31;
                           }
                        }
                     } else if (this.field10706) {
                        var2.field160 = this.field10712.method3818(-31073);
                     } else {
                        var2.field160 = Class.forName(field10726[30]).getMethod(field10726[34]).invoke(this.field10694);
                     }
                  } else {
                     if (class188.method1462(true) < field10700) {
                        throw new IOException();
                     }

                     String var17 = (255 & var2.field155 >> 24) + "." + ((16755351 & var2.field155) >> 16) + "." + ((65412 & var2.field155) >> 8) + "." + (255 & var2.field155);
                     var2.field160 = InetAddress.getByName(var17).getHostName();
                  }
               } else {
                  Transferable var18 = (Transferable)var2.field158;
                  Clipboard var19 = Toolkit.getDefaultToolkit().getSystemClipboard();
                  var19.setContents(var18, (ClipboardOwner)null);
               }
            } else {
               if (~class188.method1462(true) > ~field10700) {
                  throw new IOException();
               }

               try {
                  var2.field160 = class462.method3458((String)var2.field158, var2.field155, (byte)-90).method3850(70);
               } catch (class345 var29) {
                  var2.field160 = var29.getMessage();
                  throw var29;
               }
            }

            var2.field159 = 1;
         } catch (ThreadDeath var32) {
            throw var32;
         } catch (Throwable var33) {
            var2.field159 = 2;
         }

         synchronized(var2) {
            var2.notify();
         }
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(B)V",
      line = 318
   )
   public final void method5198(byte arg0) {
      int var2 = 62 % ((-49 - arg0) / 45);
      field10700 = class188.method1462(true) - -5000L;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ILjava/lang/String;)Lil;",
      line = 333
   )
   public static final class7 method5199(int arg0, String arg1) {
      return arg0 != 8 ? null : method5205(arg1, arg0 + 117, field10702, field10697);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ILjava/lang/Object;IBI)Ldaa;",
      line = 346
   )
   private final class12 method5200(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
      class12 var6 = new class12();
      var6.field155 = arg0;
      var6.field161 = arg2;
      var6.field156 = arg4;
      var6.field158 = arg1;
      synchronized(this) {
         int var8 = -86 % (arg3 / 52);
         if (this.field10716 == null) {
            this.field10716 = this.field10721 = var6;
         } else {
            this.field10716.field157 = var6;
            this.field10716 = var6;
         }

         this.notify();
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Ldaa;",
      line = 375
   )
   public final class12 method5201(String arg0, Class arg1, boolean arg2) {
      if (arg2) {
         this.field10710 = true;
      }

      return this.method5200(0, new Object[]{arg1, arg0}, 9, (byte)122, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ldaa;",
      line = 386
   )
   public final class12 method5202(String arg0, int arg1) {
      if (arg1 != 0) {
         this.method5204(51, (String)null, (Class[])null, (Class)null);
      }

      return this.method5200(0, arg0, 16, (byte)85, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Z)Ldaa;",
      line = 398
   )
   public final class12 method5203(boolean arg0) {
      if (arg0) {
         this.method5197((byte)110);
      }

      return this.method5200(0, (Object)null, 5, (byte)69, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ldaa;",
      line = 410
   )
   public final class12 method5204(int arg0, String arg1, Class[] arg2, Class arg3) {
      if (arg0 != 11853) {
         field10709 = null;
      }

      return this.method5200(0, new Object[]{arg3, arg1, arg2}, 8, (byte)-67, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lil;",
      line = 423
   )
   private static final class7 method5205(String arg0, int arg1, int arg2, String arg3) {
      String var4;
      if (~arg2 == -34) {
         var4 = field10726[9] + arg3 + field10726[10] + arg0 + field10726[2];
      } else if (~arg2 != -35) {
         var4 = field10726[9] + arg3 + field10726[10] + arg0 + field10726[4];
      } else {
         var4 = field10726[9] + arg3 + field10726[10] + arg0 + field10726[0];
      }

      String[] var5 = new String[]{field10726[5], field10726[11], field10713, field10726[8], field10726[1], field10726[3], field10726[7], ""};

      for(int var6 = 0; ~var5.length < ~var6; ++var6) {
         String var7 = var5[var6];
         if (var7.length() <= 0 || (new File(var7)).exists()) {
            try {
               return new class7(new File(var7, var4), field10726[6], 10000L);
            } catch (Exception var9) {
            }
         }
      }

      if (arg1 < 100) {
         field10698 = null;
      }

      return null;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "([ILjava/awt/Point;IILjava/awt/Component;I)Ldaa;",
      line = 482
   )
   public final class12 method5206(int[] arg0, Point arg1, int arg2, int arg3, Component arg4, int arg5) {
      if (arg3 != 0) {
         this.field10694 = null;
      }

      return this.method5200(arg2, new Object[]{arg4, arg0, arg1}, 17, (byte)-88, arg5);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ZIILjava/lang/String;)Ldaa;",
      line = 494
   )
   public final class12 method5207(boolean arg0, int arg1, int arg2, String arg3) {
      return arg1 != 0 ? null : this.method5200(arg2, arg3, !arg0 ? 1 : 22, (byte)-108, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "([BLjava/io/File;I)Z",
      line = 511
   )
   public final boolean method5208(byte[] arg0, File arg1, int arg2) {
      try {
         FileOutputStream var4 = new FileOutputStream(arg1);
         if (arg2 < 56) {
            this.field10711 = null;
         }

         var4.write(arg0, 0, arg0.length);
         var4.close();
         return true;
      } catch (IOException var5) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(I)V",
      line = 538
   )
   public final void method5209(int arg0) {
      if (arg0 == 0) {
         synchronized(this) {
            this.field10717 = true;
            this.notifyAll();
         }

         try {
            this.field10695.join();
         } catch (InterruptedException var8) {
         }

         if (this.field10711 != null) {
            try {
               this.field10711.method60(false);
            } catch (IOException var7) {
            }
         }

         if (this.field10707 != null) {
            try {
               this.field10707.method60(false);
            } catch (IOException var6) {
            }
         }

         if (this.field10718 != null) {
            for(int var3 = 0; ~this.field10718.length < ~var3; ++var3) {
               if (this.field10718[var3] != null) {
                  try {
                     this.field10718[var3].method60(false);
                  } catch (IOException var5) {
                  }
               }
            }
         }

         if (this.field10699 != null) {
            try {
               this.field10699.method60(false);
            } catch (IOException var4) {
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(II)Ldaa;",
      line = 594
   )
   public final class12 method5210(int arg0, int arg1) {
      return arg0 != 22 ? null : this.method5200(arg1, (Object)null, 3, (byte)81, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(IIIBI)Ldaa;",
      line = 604
   )
   public final class12 method5211(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      if (arg3 != -2) {
         this.method5213((URL)null, -117);
      }

      return this.method5200((arg2 << 16) + arg4, (Object)null, 6, (byte)-61, (arg1 << 16) + arg0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "<init>",
      descriptor = "(ILjava/lang/String;IZ)V",
      line = 699
   )
   public class719(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
      field10708 = field10726[27];
      this.field10710 = arg3;
      field10697 = arg1;
      field10705 = field10726[32];
      field10702 = arg0;

      try {
         field10708 = System.getProperty(field10726[26]);
         field10705 = System.getProperty(field10726[21]);
      } catch (Exception var20) {
      }

      if (~field10708.toLowerCase().indexOf(field10726[14]) != 0) {
         this.field10706 = true;
      }

      try {
         field10714 = System.getProperty(field10726[17]);
      } catch (Exception var19) {
         field10714 = field10726[27];
      }

      field10719 = field10714.toLowerCase();

      try {
         field10698 = System.getProperty(field10726[31]).toLowerCase();
      } catch (Exception var18) {
         field10698 = "";
      }

      try {
         field10696 = System.getProperty(field10726[25]).toLowerCase();
      } catch (Exception var17) {
         field10696 = "";
      }

      try {
         field10713 = System.getProperty(field10726[33]);
         if (field10713 != null) {
            field10713 = field10713 + "/";
         }
      } catch (Exception var16) {
      }

      if (field10713 == null) {
         field10713 = field10726[15];
      }

      try {
         this.field10715 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var15) {
      }

      if (!this.field10706) {
         try {
            field10709 = Class.forName(field10726[23]).getDeclaredMethod(field10726[12], Boolean.TYPE);
         } catch (Exception var14) {
         }

         try {
            field10720 = Class.forName(field10726[16]).getDeclaredMethod(field10726[13], Boolean.TYPE);
         } catch (Exception var13) {
         }
      }

      class533.method3955(field10702, field10697, 1);
      if (this.field10710) {
         this.field10699 = new class7(class533.method3956((String)null, field10726[28], -53, field10702), field10726[6], 25L);
         this.field10711 = new class7(class533.method3954(field10726[18], (byte)103), field10726[6], 314572800L);
         this.field10707 = new class7(class533.method3954(field10726[22], (byte)50), field10726[6], 1048576L);
         this.field10718 = new class7[arg2];

         for(int var5 = 0; ~arg2 < ~var5; ++var5) {
            this.field10718[var5] = new class7(class533.method3954(field10726[19] + var5, (byte)67), field10726[6], 1048576L);
         }

         if (this.field10706) {
            try {
               this.field10704 = Class.forName(field10726[29]).newInstance();
            } catch (Throwable var12) {
            }
         }

         try {
            if (this.field10706) {
               this.field10712 = new class516();
            } else {
               this.field10694 = Class.forName(field10726[30]).newInstance();
            }
         } catch (Throwable var11) {
         }

         try {
            if (this.field10706) {
               this.field10701 = new class735();
            } else {
               this.field10703 = Class.forName(field10726[20]).newInstance();
            }
         } catch (Throwable var10) {
         }
      }

      if (this.field10710 && !this.field10706) {
         ThreadGroup var6 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
            var6 = var7;
         }

         Thread[] var8 = new Thread[1000];
         var6.enumerate(var8);

         for(int var9 = 0; ~var9 > ~var8.length; ++var9) {
            if (var8[var9] != null && var8[var9].getName().startsWith(field10726[24])) {
               var8[var9].setPriority(1);
            }
         }
      }

      this.field10717 = false;
      this.field10695 = new Thread(this);
      this.field10695.setPriority(10);
      this.field10695.setDaemon(true);
      this.field10695.start();
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/String;ZZ)Ldaa;",
      line = 625
   )
   public final class12 method5212(String arg0, boolean arg1, boolean arg2) {
      if (arg2) {
         this.method5214((Runnable)null, -84, 87);
      }

      return !arg1 ? this.method5200(0, arg0, 13, (byte)114, 0) : this.method5200(0, arg0, 12, (byte)-76, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/net/URL;I)Ldaa;",
      line = 648
   )
   public final class12 method5213(URL arg0, int arg1) {
      return arg1 != 1463071632 ? null : this.method5200(0, arg0, 4, (byte)-71, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;II)Ldaa;",
      line = 659
   )
   public final class12 method5214(Runnable arg0, int arg1, int arg2) {
      int var4 = -86 % ((32 - arg1) / 49);
      return this.method5200(arg2, arg0, 2, (byte)84, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ILjava/awt/Frame;)Ldaa;",
      line = 672
   )
   public final class12 method5215(int arg0, Frame arg1) {
      return arg0 != -20734 ? null : this.method5200(0, arg1, 7, (byte)78, 0);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(I)Ljava/lang/Object;",
      line = 683
   )
   public final Object method5216(int arg0) {
      return arg0 != -17207 ? null : this.field10704;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5218(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5219(char[] arg0) {
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
            var10005 = 79;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
