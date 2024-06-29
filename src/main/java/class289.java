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

@OriginalClass("client!su")
public class class289 implements Runnable {
   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "Ltq;"
   )
   public class441 field4557 = null;
   @OriginalMember(
      owner = "client!su",
      name = "s",
      descriptor = "Lbja;"
   )
   private class275 field4559 = null;
   @OriginalMember(
      owner = "client!su",
      name = "g",
      descriptor = "Z"
   )
   public boolean field4556 = false;
   @OriginalMember(
      owner = "client!su",
      name = "D",
      descriptor = "Z"
   )
   private boolean field4562 = false;
   @OriginalMember(
      owner = "client!su",
      name = "o",
      descriptor = "Ltq;"
   )
   public class441 field4554 = null;
   @OriginalMember(
      owner = "client!su",
      name = "C",
      descriptor = "Ltq;"
   )
   public class441 field4555 = null;
   @OriginalMember(
      owner = "client!su",
      name = "A",
      descriptor = "Lbja;"
   )
   private class275 field4569 = null;
   @OriginalMember(
      owner = "client!su",
      name = "l",
      descriptor = "Z"
   )
   public boolean field4542 = false;
   @OriginalMember(
      owner = "client!su",
      name = "f",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field4560;
   @OriginalMember(
      owner = "client!su",
      name = "q",
      descriptor = "[Ltq;"
   )
   public class441[] field4566;
   @OriginalMember(
      owner = "client!su",
      name = "y",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field4547;
   @OriginalMember(
      owner = "client!su",
      name = "r",
      descriptor = "Lat;"
   )
   private class422 field4567;
   @OriginalMember(
      owner = "client!su",
      name = "c",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field4563;
   @OriginalMember(
      owner = "client!su",
      name = "w",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field4548;
   @OriginalMember(
      owner = "client!su",
      name = "m",
      descriptor = "Lvc;"
   )
   private class347 field4544;
   @OriginalMember(
      owner = "client!su",
      name = "F",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field4564;
   @OriginalMember(
      owner = "client!su",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4574 = new String[]{method2445(method2444("yd=|url8wuwd7zO:l0j\u0018!0")), method2445(method2444("g` TEwp'FXus1`Yui\u001fwSg@:sHx`0")), method2445(method2444("{vzdOfv=}D")), method2445(method2444("~d\"s\u0004b`&aC{k")), method2445(method2444("{vzsXwm")), method2445(method2444("yd=|url8wuwd7zO:a5f\u0018")), method2445(method2444("g` TEwp'QSwi1@E{q")), method2445(method2444("Ak?|Eck")), method2445(method2444("~d\"s\u0004ur <i{h$}Dqk ")), method2445(method2444("%+e")), method2445(method2444("~a")), method2445(method2444("~d\"s\u0004b`:vEf")), method2445(method2444("am")), method2445(method2444("{h")), method2445(method2444("yl7`Egj2f")), method2445(method2444("av1`\u0004|j9w")), method2445(method2444("j*")), method2445(method2444("{vz|Ky`")), method2445(method2444("~d\"s\u0004ur <i{k sCz`&")), method2445(method2444("UR\u0000")), method2445(method2444("fd:vEy+0s^")), method2445(method2444("yd=|url8wuwd7zO:l0j")), method2445(method2444("fr")), method2445(method2444("|q bY.*{")), method2445(method2444("xl'fG{a1a")), method2445(method2444("ug7vOrb<{@\u007fi9|Edt&a^as#jSnD\u0016QnQC\u0013Zc^N\u0018_d[U\u0005@y@P\u0002ErM_d#\u0018'1a$\u001d,<k4\u00178+q9\u0007K&n=\u0000")), method2445(method2444("~d\"s\u0004ur <z{l:f")), method2445(method2444("|q b\u0010;*")), method2445(method2444("cl:")), method2445(method2444("gm;eIaw'}X")), method2445(method2444("~d\"s\u0004ur <lfd9w")), method2445(method2444("qk wX")), method2445(method2444("^d3wR4C!~F4V7`Oqk")), method2445(method2444("g` q_gq;\u007fIaw'}X")), method2445(method2444("yj\"wG{p'w")), method2445(method2444("OL")), method2445(method2444("wh02\u0005w%'fKfqt0@6%v")), method2445(method2444("q}=f")), method2445(method2444("Kw7<Nuq")), method2445(method2444(";w'qKwm1=")), method2445(method2444(";q9b\u0005")), method2445(method2444("w?{eCza;eY;")), method2445(method2444("w?{")), method2445(method2444("~d3wRK")), method2445(method2444("Kr=b\u0004pd ")), method2445(method2444("Ku&wLqw1|Iqv")), method2445(method2444("w?{`Ywd7zO;")), method2445(method2444("w?{eCzk =")), method2445(method2444(":a5f"))};
   @OriginalMember(
      owner = "client!su",
      name = "h",
      descriptor = "J"
   )
   private static volatile long field4549 = 0L;
   @OriginalMember(
      owner = "client!su",
      name = "n",
      descriptor = "I"
   )
   private static int field4553;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!su",
      name = "p",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4570;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!su",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4571;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!su",
      name = "t",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4572;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!su",
      name = "j",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4573;
   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4543;
   @OriginalMember(
      owner = "client!su",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4545;
   @OriginalMember(
      owner = "client!su",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4546;
   @OriginalMember(
      owner = "client!su",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4550;
   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private static String field4551;
   @OriginalMember(
      owner = "client!su",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   private static String field4552;
   @OriginalMember(
      owner = "client!su",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4558;
   @OriginalMember(
      owner = "client!su",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private static String field4568;
   @OriginalMember(
      owner = "client!su",
      name = "B",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field4561;
   @OriginalMember(
      owner = "client!su",
      name = "x",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field4565;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method2443(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(IB)Lbja;",
      line = 6
   )
   public final class275 method2423(int arg0, byte arg1) {
      if (arg1 != 34) {
         this.method2435(75);
      }

      return this.method2427(arg1 ^ 16776378, (Object)null, 3, 0, arg0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(IBIII)Lbja;",
      line = 16
   )
   public final class275 method2424(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      if (arg1 <= 49) {
         method2425((String)null, 6, (String)null, -99);
      }

      return this.method2427(16776344, (Object)null, 6, (arg2 << 16) + arg3, (arg4 << 16) + arg0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ltq;",
      line = 27
   )
   private static final class441 method2425(String arg0, int arg1, String arg2, int arg3) {
      if (arg1 != 10000) {
         return null;
      } else {
         String var4;
         if (arg3 == 33) {
            var4 = field4574[43] + arg2 + field4574[45] + arg0 + field4574[38];
         } else if (arg3 != 34) {
            var4 = field4574[43] + arg2 + field4574[45] + arg0 + field4574[48];
         } else {
            var4 = field4574[43] + arg2 + field4574[45] + arg0 + field4574[44];
         }

         String[] var5 = new String[]{field4574[46], field4574[39], field4552, field4574[41], field4574[47], field4574[42], field4574[40], ""};

         for(int var6 = 0; var6 < var5.length; ++var6) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
               try {
                  return new class441(new File(var7, var4), field4574[22], 10000L);
               } catch (Exception var9) {
               }
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/awt/Point;[ILjava/awt/Component;IIB)Lbja;",
      line = 82
   )
   public final class275 method2426(Point arg0, int[] arg1, Component arg2, int arg3, int arg4, byte arg5) {
      return arg5 != -106 ? null : this.method2427(16776344, new Object[]{arg2, arg1, arg0}, 17, arg4, arg3);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(ILjava/lang/Object;III)Lbja;",
      line = 92
   )
   private final class275 method2427(int arg0, Object arg1, int arg2, int arg3, int arg4) {
      class275 var6 = new class275();
      var6.field4399 = arg1;
      var6.field4402 = arg3;
      var6.field4400 = arg4;
      var6.field4403 = arg2;
      synchronized(this) {
         if (this.field4569 == null) {
            this.field4569 = this.field4559 = var6;
         } else {
            this.field4569.field4397 = var6;
            this.field4569 = var6;
         }

         if (arg0 != 16776344) {
            method2425((String)null, 74, (String)null, 98);
         }

         this.notify();
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "c",
      descriptor = "(I)Z",
      line = 125
   )
   public final boolean method2428(int arg0) {
      if (arg0 != 13) {
         return true;
      } else if (!this.field4556) {
         return false;
      } else if (this.field4542) {
         return this.field4567 != null;
      } else {
         return this.field4563 != null;
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(B)V",
      line = 143
   )
   public final void method2429(byte arg0) {
      if (arg0 < 72) {
         this.method2423(-7, (byte)6);
      }

      field4549 = class162.method1442(14080) + 5000L;
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(BIZLjava/lang/String;)Lbja;",
      line = 157
   )
   public final class275 method2430(byte arg0, int arg1, boolean arg2, String arg3) {
      int var5 = 36 % ((arg0 - 55) / 49);
      return this.method2427(16776344, arg3, arg2 ? 22 : 1, 0, arg1);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lbja;",
      line = 167
   )
   public final class275 method2431(byte arg0, String arg1, Class arg2) {
      if (arg0 != 64) {
         this.method2430((byte)32, -79, true, (String)null);
      }

      return this.method2427(16776344, new Object[]{arg2, arg1}, 9, 0, 0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Z)Ljava/lang/Object;",
      line = 179
   )
   public final Object method2432(boolean arg0) {
      if (arg0) {
         this.method2442((Runnable)null, false, -62);
      }

      return this.field4547;
   }

   @OriginalMember(
      owner = "client!su",
      name = "<init>",
      descriptor = "(ILjava/lang/String;IZ)V",
      line = 706
   )
   public class289(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
      field4553 = arg0;
      field4568 = arg1;
      field4546 = field4574[9];
      this.field4556 = arg3;
      field4545 = field4574[7];

      try {
         field4545 = System.getProperty(field4574[11]);
         field4546 = System.getProperty(field4574[3]);
      } catch (Exception var20) {
      }

      if (field4545.toLowerCase().indexOf(field4574[14]) != -1) {
         this.field4542 = true;
      }

      try {
         field4551 = System.getProperty(field4574[17]);
      } catch (Exception var19) {
         field4551 = field4574[7];
      }

      field4558 = field4551.toLowerCase();

      try {
         field4550 = System.getProperty(field4574[4]).toLowerCase();
      } catch (Exception var18) {
         field4550 = "";
      }

      try {
         field4543 = System.getProperty(field4574[2]).toLowerCase();
      } catch (Exception var17) {
         field4543 = "";
      }

      try {
         field4552 = System.getProperty(field4574[15]);
         if (field4552 != null) {
            field4552 = field4552 + "/";
         }
      } catch (Exception var16) {
      }

      if (field4552 == null) {
         field4552 = field4574[16];
      }

      try {
         this.field4560 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var15) {
      }

      if (!this.field4542) {
         try {
            field4561 = Class.forName(field4574[8]).getDeclaredMethod(field4574[1], Boolean.TYPE);
         } catch (Exception var14) {
         }

         try {
            field4565 = Class.forName(field4574[18]).getDeclaredMethod(field4574[6], Boolean.TYPE);
         } catch (Exception var13) {
         }
      }

      class641.method4679((byte)126, field4568, field4553);
      if (this.field4556) {
         this.field4554 = new class441(class641.method4680(true, field4553, field4574[20], (String)null), field4574[22], 25L);
         this.field4557 = new class441(class641.method4678(false, field4574[5]), field4574[22], 314572800L);
         this.field4555 = new class441(class641.method4678(false, field4574[0]), field4574[22], 1048576L);
         this.field4566 = new class441[arg2];

         for(int var5 = 0; var5 < arg2; ++var5) {
            this.field4566[var5] = new class441(class641.method4678(false, field4574[21] + var5), field4574[22], 1048576L);
         }

         if (this.field4542) {
            try {
               this.field4547 = Class.forName(field4574[13]).newInstance();
            } catch (Throwable var12) {
            }
         }

         try {
            if (this.field4542) {
               this.field4567 = new class422();
            } else {
               this.field4563 = Class.forName(field4574[12]).newInstance();
            }
         } catch (Throwable var11) {
         }

         try {
            if (!this.field4542) {
               this.field4548 = Class.forName(field4574[10]).newInstance();
            } else {
               this.field4544 = new class347();
            }
         } catch (Throwable var10) {
         }
      }

      if (this.field4556 && !this.field4542) {
         ThreadGroup var6 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
            var6 = var7;
         }

         Thread[] var8 = new Thread[1000];
         var6.enumerate(var8);

         for(int var9 = 0; var9 < var8.length; ++var9) {
            if (var8[var9] != null && var8[var9].getName().startsWith(field4574[19])) {
               var8[var9].setPriority(1);
            }
         }
      }

      this.field4562 = false;
      this.field4564 = new Thread(this);
      this.field4564.setPriority(10);
      this.field4564.setDaemon(true);
      this.field4564.start();
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/lang/String;ZB)Lbja;",
      line = 195
   )
   public final class275 method2433(String arg0, boolean arg1, byte arg2) {
      if (arg2 <= 63) {
         this.field4567 = null;
      }

      return arg1 ? this.method2427(16776344, arg0, 12, 0, 0) : this.method2427(16776344, arg0, 13, 0, 0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "run",
      descriptor = "()V",
      line = 209
   )
   public final void run() {
      while(true) {
         class275 var2;
         synchronized(this) {
            while(true) {
               if (this.field4562) {
                  return;
               }

               if (this.field4559 != null) {
                  var2 = this.field4559;
                  this.field4559 = this.field4559.field4397;
                  if (this.field4559 == null) {
                     this.field4569 = null;
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
            int var3 = var2.field4403;
            if (~var3 == -2) {
               if (~class162.method1442(14080) > ~field4549) {
                  throw new IOException();
               }

               var2.field4401 = new Socket(InetAddress.getByName((String)var2.field4399), var2.field4400);
            } else if (~var3 != -23) {
               if (~var3 == -3) {
                  Thread var4 = new Thread((Runnable)var2.field4399);
                  var4.setDaemon(true);
                  var4.start();
                  var4.setPriority(var2.field4400);
                  var2.field4401 = var4;
               } else if (var3 == 4) {
                  if (class162.method1442(14080) < field4549) {
                     throw new IOException();
                  }

                  var2.field4401 = new DataInputStream(((URL)var2.field4399).openStream());
               } else if (~var3 == -9) {
                  Object[] var22 = (Object[])var2.field4399;
                  if (this.field4556 && ((Class)var22[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field4401 = ((Class)var22[0]).getDeclaredMethod((String)var22[1], (Class[])var22[2]);
               } else if (var3 == 9) {
                  Object[] var5 = (Object[])var2.field4399;
                  if (this.field4556 && ((Class)var5[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field4401 = ((Class)var5[0]).getDeclaredField((String)var5[1]);
               } else if (~var3 == -19) {
                  Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                  var2.field4401 = var21.getContents((Object)null);
               } else if (var3 == 19) {
                  Transferable var6 = (Transferable)var2.field4399;
                  Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                  var7.setContents(var6, (ClipboardOwner)null);
               } else {
                  if (!this.field4556) {
                     throw new Exception("");
                  }

                  if (var3 == 3) {
                     if (field4549 > class162.method1442(14080)) {
                        throw new IOException();
                     }

                     String var8 = (255 & var2.field4400 >> 24) + "." + ((var2.field4400 & 16776344) >> 16) + "." + (var2.field4400 >> 8 & 255) + "." + (255 & var2.field4400);
                     var2.field4401 = InetAddress.getByName(var8).getHostName();
                  } else if (var3 == 21) {
                     if (~field4549 < ~class162.method1442(14080)) {
                        throw new IOException();
                     }

                     var2.field4401 = InetAddress.getByName((String)var2.field4399).getAddress();
                  } else if (var3 != 5) {
                     if (var3 == 6) {
                        Frame var20 = new Frame(field4574[32]);
                        var2.field4401 = var20;
                        var20.setResizable(false);
                        if (this.field4542) {
                           this.field4567.method3352(var2.field4402 >> 16, -8745, 65535 & var2.field4400, var2.field4400 >>> 16, var2.field4402 & 65535, var20);
                        } else {
                           Class.forName(field4574[12]).getMethod(field4574[31], field4573 != null ? field4573 : (field4573 = method2443(field4574[30])), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field4563, var20, new Integer(var2.field4400 >>> 16), new Integer(var2.field4400 & 65535), new Integer(var2.field4402 >> 16), new Integer(var2.field4402 & 65535));
                        }
                     } else if (~var3 != -8) {
                        if (~var3 == -13) {
                           class441 var9 = method2425((String)var2.field4399, 10000, field4568, field4553);
                           var2.field4401 = var9;
                        } else if (var3 != 13) {
                           if (this.field4556 && var3 == 14) {
                              int var17 = var2.field4400;
                              int var18 = var2.field4402;
                              if (this.field4542) {
                                 this.field4544.method2801(false, var17, var18);
                              } else {
                                 Class.forName(field4574[10]).getDeclaredMethod(field4574[34], Integer.TYPE, Integer.TYPE).invoke(this.field4548, new Integer(var17), new Integer(var18));
                              }
                           } else if (this.field4556 && ~var3 == -16) {
                              boolean var10 = ~var2.field4400 != -1;
                              Component var11 = (Component)var2.field4399;
                              if (!this.field4542) {
                                 Class.forName(field4574[10]).getDeclaredMethod(field4574[29], field4570 != null ? field4570 : (field4570 = method2443(field4574[8])), Boolean.TYPE).invoke(this.field4548, var11, new Boolean(var10));
                              } else {
                                 this.field4544.method2802(var10, 0, var11);
                              }
                           } else if (!this.field4542 && ~var3 == -18) {
                              Object[] var12 = (Object[])var2.field4399;
                              Class.forName(field4574[10]).getDeclaredMethod(field4574[33], field4570 != null ? field4570 : (field4570 = method2443(field4574[8])), field4571 != null ? field4571 : (field4571 = method2443(field4574[35])), Integer.TYPE, Integer.TYPE, field4572 != null ? field4572 : (field4572 = method2443(field4574[26]))).invoke(this.field4548, (Component)var12[0], (int[])var12[1], new Integer(var2.field4400), new Integer(var2.field4402), (Point)var12[2]);
                           } else {
                              if (~var3 != -17) {
                                 throw new Exception("");
                              }

                              try {
                                 if (!field4558.startsWith(field4574[28])) {
                                    throw new Exception();
                                 }

                                 String var13 = (String)var2.field4399;
                                 if (!var13.startsWith(field4574[27]) && !var13.startsWith(field4574[23])) {
                                    throw new Exception();
                                 }

                                 String var14 = field4574[25];
                                 int var15 = 0;

                                 while(true) {
                                    if (~var13.length() >= ~var15) {
                                       Runtime.getRuntime().exec(field4574[36] + var13 + "\"");
                                       var2.field4401 = null;
                                       break;
                                    }

                                    if (var14.indexOf(var13.charAt(var15)) == -1) {
                                       throw new Exception();
                                    }

                                    ++var15;
                                 }
                              } catch (Exception var31) {
                                 var2.field4401 = var31;
                                 throw var31;
                              }
                           }
                        } else {
                           class441 var19 = method2425((String)var2.field4399, 10000, "", field4553);
                           var2.field4401 = var19;
                        }
                     } else if (this.field4542) {
                        this.field4567.method3350((byte)99, (Frame)var2.field4399);
                     } else {
                        Class.forName(field4574[12]).getMethod(field4574[37]).invoke(this.field4563);
                     }
                  } else if (this.field4542) {
                     var2.field4401 = this.field4567.method3351((byte)26);
                  } else {
                     var2.field4401 = Class.forName(field4574[12]).getMethod(field4574[24]).invoke(this.field4563);
                  }
               }
            } else {
               if (field4549 > class162.method1442(14080)) {
                  throw new IOException();
               }

               try {
                  var2.field4401 = class771.method5623(var2.field4400, (String)var2.field4399, (byte)-122).method1877(118);
               } catch (class298 var29) {
                  var2.field4401 = var29.getMessage();
                  throw var29;
               }
            }

            var2.field4398 = 1;
         } catch (ThreadDeath var32) {
            throw var32;
         } catch (Throwable var33) {
            var2.field4398 = 2;
         }

         synchronized(var2) {
            var2.notify();
         }
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "(I)Lbja;",
      line = 507
   )
   public final class275 method2434(int arg0) {
      if (arg0 != 4) {
         this.method2439((byte[])null, 3, (File)null);
      }

      return this.method2427(arg0 ^ 16776348, (Object)null, 5, 0, 0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(I)V",
      line = 520
   )
   public final void method2435(int arg0) {
      synchronized(this) {
         if (arg0 != -21621) {
            return;
         }

         this.field4562 = true;
         this.notifyAll();
      }

      try {
         this.field4564.join();
      } catch (InterruptedException var10) {
      }

      if (this.field4557 != null) {
         try {
            this.field4557.method3477((byte)122);
         } catch (IOException var9) {
         }
      }

      if (this.field4555 != null) {
         try {
            this.field4555.method3477((byte)127);
         } catch (IOException var8) {
         }
      }

      if (this.field4566 != null) {
         for(int var3 = 0; var3 < this.field4566.length; ++var3) {
            if (this.field4566[var3] != null) {
               try {
                  this.field4566[var3].method3477((byte)126);
               } catch (IOException var7) {
               }
            }
         }
      }

      if (this.field4554 != null) {
         try {
            this.field4554.method3477((byte)122);
         } catch (IOException var6) {
         }
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(BLjava/lang/String;)Lbja;",
      line = 590
   )
   public final class275 method2436(byte arg0, String arg1) {
      if (arg0 < 91) {
         field4551 = null;
      }

      return this.method2427(16776344, arg1, 16, 0, 0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lbja;",
      line = 600
   )
   public final class275 method2437(Class[] arg0, int arg1, String arg2, Class arg3) {
      if (arg1 != -16827) {
         this.field4559 = null;
      }

      return this.method2427(arg1 ^ -16760099, new Object[]{arg3, arg2, arg0}, 8, 0, 0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/awt/Frame;I)Lbja;",
      line = 612
   )
   public final class275 method2438(Frame arg0, int arg1) {
      return arg1 != 255 ? null : this.method2427(16776344, arg0, 7, 0, 0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "([BILjava/io/File;)Z",
      line = 626
   )
   public final boolean method2439(byte[] arg0, int arg1, File arg2) {
      try {
         FileOutputStream var4 = new FileOutputStream(arg2);
         var4.write(arg0, 0, arg0.length);
         if (arg1 > -20) {
            return true;
         } else {
            var4.close();
            return true;
         }
      } catch (IOException var5) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ltq;",
      line = 659
   )
   public static final class441 method2440(int arg0, String arg1) {
      int var2 = 21 / ((arg0 - 37) / 56);
      return method2425(arg1, 10000, field4568, field4553);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/net/URL;I)Lbja;",
      line = 668
   )
   public final class275 method2441(URL arg0, int arg1) {
      if (arg1 != 16980) {
         field4546 = null;
      }

      return this.method2427(16776344, arg0, 4, 0, 0);
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/lang/Runnable;ZI)Lbja;",
      line = 686
   )
   public final class275 method2442(Runnable arg0, boolean arg1, int arg2) {
      if (arg1) {
         this.field4548 = null;
      }

      return this.method2427(16776344, arg0, 2, 0, arg2);
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2444(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2445(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
